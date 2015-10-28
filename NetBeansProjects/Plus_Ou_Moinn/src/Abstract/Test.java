//
//        intervale = this.arbitre.generateIntervale();
//        System.out.println(this.arbitre.getSpeaker().presenterPartit(this,intervale));
//        System.out.print(this.arbitre.getSpeaker().demanderDefinirNbr(this.joueur));
//        this.joueur.definirValeurADevnier();
//        System.out.println(this.arbitre.getSpeaker().ConfirmerDefinirNbr(this.joueur));
//
//        System.out.println(this.arbitre.getSpeaker().demanderDefinirNbr(this.joueurAdv));
//        this.joueurAdv.definirValeurADevnier();
//        System.out.println(this.arbitre.getSpeaker().ConfirmerDefinirNbr(this.joueurAdv));
//        do{
//            /**
//             * Le joueur saisie le coup
//             */
//            System.out.println(this.arbitre.getSpeaker().montrerIntervale(this.joueur));
//            System.out.println(this.arbitre.getSpeaker().demanderGetCoup(this.joueur));
//            coup = this.joueur.getCoup();
//            System.out.println(this.arbitre.getSpeaker().montrerCoup(this.joueur));
//            /**
//             * Le joueurAdv verifie le coup
//             */
//            System.out.println(this.arbitre.getSpeaker().demanderJuger(this.joueurAdv));
//            state = this.joueurAdv.juger(coup);
//            System.out.println(this.arbitre.getSpeaker().monterJuger(this.joueurAdv));
//            /**
//             * Verifier si le joueurAdv a tricher
//             */
//            if (arbitre.estTricher(this.joueurAdv.getValeurADeviner(), this.joueur.getLastCoup(), this.joueurAdv.getLastReponse())){
//                System.out.println("Tricher ççç");
//            }else{
//                this.joueur.setResponse(this.joueurAdv.getLastReponse());
//            }
//            
//            
//            /**
//             * Le joueurAdv saisie le coup
//             */
//            System.out.println(this.arbitre.getSpeaker().montrerIntervale(this.joueurAdv));
//            System.out.println(this.arbitre.getSpeaker().demanderGetCoup(this.joueurAdv));
//            coup = this.joueurAdv.getCoup();
//            System.out.println(this.arbitre.getSpeaker().montrerCoup(this.joueurAdv));
//            /**
//             * Le joueur verifie le coup
//             */
//            System.out.println(this.arbitre.getSpeaker().demanderJuger(this.joueur));
//            state = this.joueur.juger(coup);
//            System.out.println(this.arbitre.getSpeaker().monterJuger(this.joueur));
//            
//            /**
//             * Verifier si le joueur a tricher
//             */
//            if (arbitre.estTricher(this.joueur.getValeurADeviner(), this.joueurAdv.getLastCoup(), this.joueur.getLastReponse())){
//                System.out.println("Tricher ççç");
//            }else{
//                
//                this.joueurAdv.setResponse(this.joueur.getLastReponse());
//            }
//            
//            
//            
//        }while(!runningPartie);
//        
//        winner.getScore().addScore();
//        return winner;
