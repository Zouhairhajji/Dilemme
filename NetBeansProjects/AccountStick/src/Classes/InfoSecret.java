/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author zouhairhajji
 */
public class InfoSecret {
    
    private String questionSecrete,reponseSecrete;

    public InfoSecret(String questionSecrete, String reponseSecrete) {
        this.questionSecrete = questionSecrete;
        this.reponseSecrete = reponseSecrete;
    }
   

    @Override
    public String toString() {
        return "InfoSecret [ " + "questionSecrete=" + questionSecrete + ", reponseSecrete=" + reponseSecrete + " ]";
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
