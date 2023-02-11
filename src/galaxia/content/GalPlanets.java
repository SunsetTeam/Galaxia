package galaxia.content;

import arc.graphics.Color;
import mindustry.content.*;
import mindustry.graphics.Shaders;
import mindustry.graphics.g3d.HexMesh;
import mindustry.graphics.g3d.NoiseMesh;
import mindustry.graphics.g3d.SunMesh;
import mindustry.maps.generators.BlankPlanetGenerator;
import mindustry.maps.planet.AsteroidGenerator;
import mindustry.maps.planet.TantrosPlanetGenerator;
import mindustry.type.*;

public class GalPlanets {
    public static Planet TODO, TODO1;

    public static void load() {
        TODO = new Planet("null", Planets.sun, 4){{
            bloom = true;
            accessible = false;
            drawOrbit = false;
            orbitRadius = 5000;

            solarSystem = this;

            meshLoader = () -> new SunMesh(
                    this, 4,
                    5, 0.3, 1.7, 1.2, 1,
                    1.1f,
                  //TODO ned palette
                    Color.valueOf("ffffff"),
                    Color.valueOf("ffffff"),
                    Color.valueOf("ffffff"),
                    Color.valueOf("ffffff"),
                    Color.valueOf("ffffff"),
                    Color.valueOf("ffffff")
            );
        }};

        TODO1 = new Planet("null-1", TODO, 1, 4){{
           meshLoader = () -> new HexMesh(this, 4);
           generator = new TantrosPlanetGenerator();//TODO

           atmosphereColor = Color.valueOf("5ee5b1");
           atmosphereRadIn = 0.02f;
           atmosphereRadOut = 0.3f;

           bloom = false;

           alwaysUnlocked = true;

           solarSystem = TODO;
        }};
    }
}
