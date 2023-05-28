package Jogo;


import Entidades.*;

import Itens.Arma;
import Itens.ItemHeroi;
import Itens.ItemTipoHeroi;
import Itens.Pocao;


import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        labirinto();

    }


    public static boolean labirinto(){
        Scanner scanner = new Scanner(System.in);

        Vendedor vendedor =  new Vendedor();

        ArrayList<ItemTipoHeroi> classeHeroiHunter = new ArrayList<ItemTipoHeroi>();
        ArrayList<ItemTipoHeroi> classeHeroiWarlock = new ArrayList<ItemTipoHeroi>();
        ArrayList<ItemTipoHeroi> classeHeroiWarrior = new ArrayList<ItemTipoHeroi>();
        ArrayList<ItemTipoHeroi> classeHeroiAll = new ArrayList<ItemTipoHeroi>();

        classeHeroiHunter.add(ItemTipoHeroi.HUNTER);
        classeHeroiWarrior.add(ItemTipoHeroi.WARRIOR);
        classeHeroiWarlock.add(ItemTipoHeroi.WARLOCK);
        classeHeroiAll.add(ItemTipoHeroi.WARLOCK);
        classeHeroiAll.add(ItemTipoHeroi.HUNTER);
        classeHeroiAll.add(ItemTipoHeroi.WARRIOR);


        Arma avenger = new Arma ("Avenger" , 50,48, classeHeroiWarrior);
        Arma woodieBlade = new Arma("Espada de Madeira",10, 5, classeHeroiWarrior);
        Arma initialStaff = new Arma("Cajado de aprendiz",10,5,classeHeroiWarlock);
        Arma ancientStaff = new Arma("Cajado de fogo",50,48,classeHeroiWarlock);
        Arma initialBow = new Arma("Arco",10,5,classeHeroiHunter);
        Pocao pocaoHp = new Pocao("Pocão",7, 25,classeHeroiAll);
        Pocao pocaoSuprema = new Pocao("Poção Suprema",14,50,classeHeroiAll);


        avenger.lookItem();

        vendedor.addItem(woodieBlade);
        vendedor.addItem(initialStaff);
        vendedor.addItem(ancientStaff);
        vendedor.addItem(initialBow);
        vendedor.addItem(pocaoHp);
        vendedor.addItem(pocaoSuprema);
        vendedor.addItem(avenger);

        Npc troll = new Npc("Troll", 150,5);
        Npc trollChampion = new Npc("Troll Champion", 300,20);



        String name;
        int op = 0;
        int dificuldade = 0;
        int hp = 0;
        int damage = 0;
        int opcaoCompra = 0;
        int repetir = 0;
        Heroi vocacao =null;
        do {
            System.out.println("Bem-vindo(a) ao mundo de Venore! \n\nAqui, você terá a oportunidade de embarcar em uma jornada épica e se tornar um(a) lendário(a) aventureiro(a). \nAntes de começar essa incrível jornada, gostaríamos de conhecê-lo(a) melhor. \n\nComo devemos chamá-lo(a) para iniciar esta nova aventura? ");
            name = scanner.nextLine();
            System.out.println("Qual heroi você quer utilizar? \n1=Warrior\n2=Warlock\n3=Hunter");
            System.out.println("Indique a opção escolhida: ");
            op = scanner.nextInt();


            switch (op){


                case 1:

                    System.out.println("Dificuldade? \n1= fácil\n2=difícil");
                    System.out.println("Defina sua dificuldade: ");
                    dificuldade = scanner.nextInt();
                    if (dificuldade == 1){
                        do {


                            System.out.println("Tem 300 pontos de criação\n divida entre vida e força");
                            System.out.println("Vida: ");
                            hp = scanner.nextInt();

                            damage = (300 - hp) / 5;
                            System.out.println("Força: " + damage);
                            System.out.println("Tem certeza?\n1-Sim\n2-Não");
                            repetir = scanner.nextInt();


                        } while (repetir == 2);



                        vocacao = new Warrior(20, name, hp,damage);

                    } else if (dificuldade == 2) {

                        do {
                            System.out.println("Tem 220 pontos de criação\n divida entre vida e força");


                            System.out.println("Vida: ");
                            hp = scanner.nextInt();

                            damage = (220 - hp) / 5;
                            System.out.println("Força: " + damage);

                            System.out.println("Tem certeza?\n1-Sim\n2-Não");
                            repetir = scanner.nextInt();


                        } while (repetir == 2);
                    }
                    break;
                case 2:

                    System.out.println("Dificuldade? \n1= fácil\n2=difícil");
                    System.out.println("Defina sua dificuldade: ");
                    dificuldade = scanner.nextInt();
                    if (dificuldade == 1){

                        do {


                            System.out.println("Tem 300 pontos de criação\n divida entre vida e força");
                            System.out.println("Vida: ");
                            hp = scanner.nextInt();

                            damage = (300 - hp) / 5;
                            System.out.println("Força: " + damage);
                            System.out.println("Tem certeza?\n1-Sim\n2-Não");
                            repetir = scanner.nextInt();


                        } while (repetir == 2);



                            vocacao = new Warlock(name, hp,damage,20);




                    } else if (dificuldade == 2) {

                        System.out.println("Tem 220 pontos de criação\n divida entre vida e força");
                        do{
                            System.out.println("Tem 220 pontos de criação\n divida entre vida e força");
                            System.out.println("Vida: ");
                            hp = scanner.nextInt();

                            damage = (220 - hp) / 5;
                            System.out.println("Força: " + damage);
                            System.out.println("Tem certeza?\n1-Sim\n2-Não");
                            repetir = scanner.nextInt();


                        } while (repetir == 2);

                           vocacao = new Warlock(name, hp,damage,15);


                    } else{
                        System.out.println("Error");
                    }


                    break;

                case 3:

                    System.out.println("Dificuldade? \n1= fácil\n2=difícil");
                    System.out.println("Defina sua dificuldade: ");
                    dificuldade = scanner.nextInt();
                    if (dificuldade == 1){
                        do {


                            System.out.println("Tem 300 pontos de criação\n divida entre vida e força");
                            System.out.println("Vida: ");
                            hp = scanner.nextInt();

                            damage = (300 - hp) / 5;
                            System.out.println("Força: " + damage);
                            System.out.println("Tem certeza?\n1-Sim\n2-Não");
                            repetir = scanner.nextInt();


                        } while (repetir == 2);



                        vocacao = new Hunter(name, hp,damage,20);


                    } else if (dificuldade == 2) {

                        System.out.println("Tem 220 pontos de criação\n divida entre vida e força");
                        do {
                            System.out.println("Tem 220 pontos de criação\n divida entre vida e força");
                            System.out.println("Vida: ");
                            hp = scanner.nextInt();

                            damage = (220 - hp) / 5;
                            System.out.println("Força: " + damage);

                            System.out.println("Tem certeza?\n1-Sim\n2-Não");
                            repetir = scanner.nextInt();


                        } while (repetir == 2);

                        vocacao = new Hunter(name, hp, damage, 15);
                    }


                    break;
                        default:
                            System.out.println("Opção errada! Preste atenção Jogador!!");

            }


        }while (op < 1 || op > 3);

        System.out.println("\"Embarque em uma jornada épica em um mundo medieval repleto de magia e aventura. Torne-se um poderoso cavaleiro, um habilidoso mago ou um arqueiro preciso. Explore terras misteriosas, enfrente criaturas lendárias e forje seu próprio destino. Domine habilidades, conquiste tesouros e deixe sua marca na história deste reino. Bem-vindo(a) a [nome do jogo], onde a glória o(a) aguarda!");


        op=1;
        int i=1, comprar=0;
        boolean vitoria = true, batalha;
        do {

      i++;
        switch (op){
            case 1:

                System.out.println("Deseja comprar poções e/ou armas? \n1= SIM \n2 =NÃO");
                comprar =  scanner.nextInt();
                if (comprar == 1 ){
                    vendedor.venderItem(vocacao);
                } else {
                    System.out.println("Talvez numa proxima.");
                }
                System.out.println("Boa sorte em sua jornada");
                op= i;
                break;
            case 2:

                System.out.println("Um troll foi avistado!");
                batalha=vocacao.atacar(troll);
                if (!batalha){
                    System.out.println("Você está morto!");
                    return false;
                }
                vocacao.tomarPocao();
                vocacao.levelUp();
                op=1;
                break;
            case 3:
                System.out.println("Tesouro + historinha");
                // colocar if como opção para a casa 4 ou 6
                break;
            case 4:
                System.out.println("Salamander avistada");

//                if (!batalha){
//                    System.out.println("Você está morto!");
//                    return false;
//                }
                vocacao.tomarPocao();
                vocacao.levelUp();
                op=1;
                break;
            case 5:
                System.out.println("Historia");
                //2 OPCOES if casa 6 ou 7
                break;
            case 6:
                System.out.println("Troll Champion");
//                if (!batalha){
//                    System.out.println("Você está morto!");
//                    return false;
//                }
                vocacao.tomarPocao();
                vocacao.levelUp();
                op=1;
                break;
            case 7:
                System.out.println("tesouro + historia");
                //if com 3 opções para a 8, 9 e 10
                break;
            case 8:
                System.out.println("Troll champion outra vez");
//                if (!batalha){
//                    System.out.println("Você está morto!");
//                    return false;
//                }
                vocacao.tomarPocao();
                vocacao.levelUp();
                op = 1;
                break;
            case 9:
                System.out.println("tesouro mais historia");
                //if com duas opções 10 ou 11
                break;
            case 10:
                System.out.println("Inimigo semi-boss");
//                if (!batalha){
//                    System.out.println("Você está morto!");
//                    return false;
//                }
                vocacao.tomarPocao();
                vocacao.levelUp();
                op=1;
                break;
            case 11:
                System.out.println("Historia sobre o mundo, preparação luta final");
                op =1;
                break;
            case 12:

                System.out.println("Final boss");
//                if (!batalha){
//                    System.out.println("Você está morto!");
//                    return false;
//                }

                vocacao.levelUp();
                return true;


            default:
                break;
        }
        } while (vitoria == true);
        return false;
    }
}
