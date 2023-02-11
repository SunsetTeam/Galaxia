package galaxia.content;

import arc.graphics.Color;
import arc.math.Mathf;
import arc.math.geom.Vec2;
import arc.struct.Seq;
import mindustry.entities.Effect;

public class GalFx {

    public static void lightning(float x1, float y1, float x2, float y2, Color c, int iterations, float rndScale, Effect e) {
        Seq<Vec2> lines = new Seq<>();
        boolean swap = Math.abs(y1 - y2) < Math.abs(x1 - x2);
        if(swap) {
            lines.add(new Vec2(y1, x1));
            lines.add(new Vec2(y2, x2));
        } else {
            lines.add(new Vec2(x1, y1));
            lines.add(new Vec2(x2, y2));
        }
        for (int i = 0; i < iterations; i++) {
            for (int j = 0; j < lines.size - 1; j += 2) {
                Vec2 v1 = lines.get(j), v2 = lines.get(j + 1);
                Vec2 v = new Vec2((v1.x + v2.x) / 2, ((v1.y + v2.y) / 2));
                float ang = (v2.angle(v1) + 90f) * Mathf.degRad;
                float sin = Mathf.sin(ang), cos = Mathf.cos(ang);
                float rnd = Mathf.random(rndScale);
                v.x += rnd * sin;
                v.y += rnd * cos;
                lines.insert(j + 1, v);
            }
        }
        if(swap) {
            for(int i = 0; i < lines.size; i++) {
                Vec2 v = lines.get(i);
                float px = v.x;
                v.x = v.y;
                v.y = px;
            }
        }
        e.at(x1, y1, 0f, c, lines);
    }
}
