package com.xworkz.bele.runner;

import com.xworkz.bele.internal.rule.*;
import com.xworkz.bele.external.impl.*;

public class FiveFeatureRunner {
    public static void main(String[] args) {

        MusicRoom musicRoom = new ClassicMusicRoom();
        musicRoom.playInstrument();
        musicRoom.practiceVocals();
        musicRoom.tuneInstrument();
        musicRoom.recordMusic();
        musicRoom.organizeConcert();

        Gym homeGym = new HomeGym();
        homeGym.liftWeights();
        homeGym.doCardio();
        homeGym.stretch();
        homeGym.drinkWater();
        homeGym.monitorHeartRate();

        Studio editingStudio = new EditingStudio();
        editingStudio.shootVideo();
        editingStudio.editFootage();
        editingStudio.addEffects();
        editingStudio.renderVideo();
        editingStudio.publishContent();

        Workshop woodWorkshop = new WoodWorkshop();
        woodWorkshop.cutWood();
        woodWorkshop.weldMetal();
        woodWorkshop.paintSurface();
        woodWorkshop.useTools();
        woodWorkshop.ensureSafety();

        HomeTheater luxuryHomeTheater = new LuxuryHomeTheater();
        luxuryHomeTheater.turnOnProjector();
        luxuryHomeTheater.adjustVolume();
        luxuryHomeTheater.streamMovie();
        luxuryHomeTheater.dimLights();
        luxuryHomeTheater.enjoyShow();
    }
}
