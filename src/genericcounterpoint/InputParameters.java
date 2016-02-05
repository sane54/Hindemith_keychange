/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericcounterpoint;

import ModeModules.ChromaticTonic_keyChange;
import ModeModules.Clydian_keyChange;
import RhythmModules.FunkRiffPatternGenerator;
import RhythmModules.VarNoteFunkRiffPatternGenerator;
import RhythmModules.VarTimeSigFunkPatternGenerator;
import RhythmModules.VarTimeSigSuperStraightPatternGenerator;

/**
 *
 * @author alyssa
 */
public class InputParameters {
static Integer [] consonances = {0, 3, 4, 7, 8, 9};
static Integer [] perfect_consonances = {0, 7};
static Integer [] root_consonances = {0, 3, 4, 7};
static int tempo_bpm = 120;
static int piece_length = 4;
static int root_key = 0;
static ModeModule my_mode_module = new Clydian_keyChange();
static String [] voice_array = {"bass", "soprano",  "tenor"};  
static RhythmModule james = new VarNoteFunkRiffPatternGenerator();
static boolean large_dissonance_bad = true;
}
