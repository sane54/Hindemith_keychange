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
static String [] voice_array = {"bass", "soprano",  "ultra", "tenor"};  
static RhythmModule james = new VarNoteFunkRiffPatternGenerator();
static boolean large_dissonance_bad = false;

public static void setLargeDissonanceBad(boolean is_bad){
    large_dissonance_bad = is_bad;
    }
public static void setJames(String generator_string){
    if (generator_string == "Funk Rhythm Patterns 1") 
        james = new FunkRiffPatternGenerator();
    if (generator_string == "Funk Rhythm Patterns 2") 
        james = new VarNoteFunkRiffPatternGenerator();
    if (generator_string == "Variable Time Signature Unfunky")
        james = new VarTimeSigSuperStraightPatternGenerator();
    if (generator_string == "Variable Time Signature Funky") 
        james = new VarTimeSigFunkPatternGenerator();
    }
public static void setVoiceArray (String [] my_voice_array){
    voice_array = my_voice_array;
    }
public static void setModeModule (String this_mode_module) {
    if (this_mode_module == "Lydian")
        my_mode_module = new Clydian_keyChange();
    }
public static void setPieceLength(int my_piece_length) {
    piece_length = my_piece_length;    
    }
public static void setTempo(int my_tempo) {
    tempo_bpm = my_tempo;    
    }
public static void setConsonances(Integer [] my_consonances) {
    consonances = my_consonances;
    }
public static void setPerfectConsonances(Integer [] my_perf_consonances) {
    perfect_consonances = my_perf_consonances;
    }
}
