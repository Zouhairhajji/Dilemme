/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compte;

/**
 *
 * @author zouhairhajji
 */
public class InformationsSecrete {
    
    private String questionSecrete;
    private String reponseSecrete;

    public InformationsSecrete(String questionSecrete, String reponseSecrete) {
        this.questionSecrete = questionSecrete;
        this.reponseSecrete = reponseSecrete;
    }
    
    /*
        toString()
    */
    @Override
    public String toString() {
        return "InformationsSecrete{" + "questionSecrete=" + questionSecrete + ", reponseSecrete=" + reponseSecrete + '}';
    }
    
    
    /*
        Getter and Setter
    */
    public InformationsSecrete() {
         this.questionSecrete = "";
        this.reponseSecrete = "";
    }

    public String getQuestionSecrete() {
        return questionSecrete;
    }

    public void setQuestionSecrete(String questionSecrete) {
        this.questionSecrete = questionSecrete;
    }

    public String getReponseSecrete() {
        return reponseSecrete;
    }

    public void setReponseSecrete(String reponseSecrete) {
        this.reponseSecrete = reponseSecrete;
    }
    
   
    
    
    
    
}
