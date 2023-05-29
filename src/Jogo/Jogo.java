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
        Scanner scanner = new Scanner(System.in);
        boolean vencer;
        int resposta=0;

        do {
            vencer=labirinto();

            if (!vencer){
                System.out.println("Game over!!\nDeseja tentar outra vez? \n1-Sim\n2-Não");
                resposta = scanner.nextInt();

            }else {
                System.out.println("\"Vitória gloriosa! Seu poder e determinação triunfaram sobre todos os desafios.\n Você derrotou as forças das trevas, desvendou segredos antigos e se tornou o(a) herói(a) lendário(a) que o reino precisava. \nSua bravura será celebrada e seu nome será entoado em canções de coragem e honra. Continue a escrever sua lenda, pois o mundo aguarda suas próximas conquistas! Parabéns por dominar o mundo de Venore!\"");
            }

        }while (resposta == 1);


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


        Arma avenger = new Arma ("Avenger Blade" , 50,48, classeHeroiWarrior);
        Arma woodieBlade = new Arma("Espada de Madeira",10, 5, classeHeroiWarrior);
        Arma initialStaff = new Arma("Cajado de aprendiz",10,5,classeHeroiWarlock);
        Arma ancientStaff = new Arma("Cajado de fogo",50,48,classeHeroiWarlock);
        Arma initialBow = new Arma("Arco",10,5,classeHeroiHunter);
       Arma arcaneBow = new Arma("Arco do Destino", 50,48,classeHeroiHunter);


       Arma ironSword = new Arma("Arma de Ferro", 25,20,classeHeroiWarrior);
       Arma cajadoMedio = new Arma("Cajado do Vórtice",25,20,classeHeroiWarlock);
       Arma arcoLongo = new Arma("Arco Longo", 25,25,classeHeroiHunter);

        Pocao pocaoHp = new Pocao("Pocão",7, 25,classeHeroiAll);
        Pocao pocaoSuprema = new Pocao("Poção Suprema",14,50,classeHeroiAll);


        avenger.lookItem();
    //Inicial itens
        vendedor.addItem(woodieBlade);
        vendedor.addItem(initialStaff);
        vendedor.addItem(initialBow);

      //MEDIO ITENSS
    vendedor.addItem(ironSword);
    vendedor.addItem(cajadoMedio);
    vendedor.addItem(arcoLongo);

    //FINAL ITENS
        vendedor.addItem(avenger);
        vendedor.addItem(ancientStaff);
        vendedor.addItem(arcaneBow);
    //POÇÕES
        vendedor.addItem(pocaoHp);
        vendedor.addItem(pocaoSuprema);


        Npc troll = new Npc("Troll", 150,5);
        Npc trollChampion = new Npc("Troll Champion", 220,15);
        Npc salamander = new Npc("Salamandra",200,10);
        Npc magoTroll = new Npc("Mago Troll", 150,15);
        Npc reiTroll = new Npc("Rei Troll",250,18);
        Npc boss = new Npc("Demonio Javeiro",300,20);



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
            System.out.println("Oráculo: Nesse ponto da aventura o(a) " + name +" deve escolher a sua vocação.  \n1=Warrior\n2=Warlock\n3=Hunter");
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
                            break;

            }


        }while (op < 1 || op > 3);

        System.out.println("Torne-se um poderoso cavaleiro, um habilidoso mago ou um arqueiro preciso. Explore terras misteriosas, enfrente criaturas lendárias e forje seu próprio destino. Bem-vindo(a) a Venore, onde a glória o(a) aguarda!");


        op=1;
        int escolha;
        int i=2, comprar=0;
        boolean vitoria = true, batalha;
        do {


        switch (op){
            case 1:

                System.out.println("Sua bolsa tem: " + vocacao.getOuro() + " moedas de ouro");

                System.out.println("Você se encontra no vendedor, uma zona segura e fora de perigo. Deseja comprar poções e/ou armas? \n1= SIM \n2 =NÃO");
                comprar =  scanner.nextInt();
                if (comprar == 1 ){
                    vendedor.venderItem(vocacao);
                } else {
                    System.out.println("Talvez numa proxima.");
                }
                System.out.println("Boa sorte em sua jornada");
                System.out.println("-------------------------------");

                op= i;

                break;
            case 2:

                System.out.println("Um troll foi avistado!");

                System.out.println("Se inicia uma batalha mortal");
                System.out.println("-------------------------------");
                batalha=vocacao.atacar(troll);
                if (!batalha){
                    System.out.println("Você está morto!");
                    return false;
                }
                vocacao.tomarPocao();
                vocacao.levelUp();
                i = 3;
                op=1;
                break;
            case 3:
                System.out.println("Lady Tenebris: Com voz suave e olhos cheios de admiração, a Lady agradeceu ao herói com palavras sinceras. \n \"Oh, nobre defensor, você trouxe luz à minha vida quando tudo estava imerso na escuridão. Sua coragem e habilidade me resgataram das garras do mal. \nEu sou eternamente grata por sua intervenção oportuna e me salvar desse horrível Troll.\"");
                System.out.println("Você recebeu 25 moedas de ouro por salvar a nobre donzela");
                vocacao.addGold(25);
                do {
                    System.out.println("1 0u 2");
                    escolha =scanner.nextInt();

                    switch (escolha){
                        case 1:
                            op=4;
                            break;
                        case 2:
                            op=6;

                            break;
                        default:
                            System.out.println("Opção errada! Preste atenção Jogador!!");
                            break;
                    }
                } while (escolha!= 1 && escolha !=2);

                break;
            case 4:
                System.out.println("Uma salamandra foi avistada");
                System.out.println("Se inicia uma batalha mortal");
                System.out.println("-------------------------------");

                batalha=vocacao.atacar(salamander);
               if (!batalha){
                   System.out.println("Você está morto!");
                   return false;
                }
                vocacao.tomarPocao();
                vocacao.levelUp();
                i = 5;
                op=1;
                break;

            case 5:
                System.out.println("Historia");
                do {
                    System.out.println("1 0u 2");
                    escolha =scanner.nextInt();

                    switch (escolha){
                        case 1:
                            op=6;
                            break;
                        case 2:
                            op=7;

                            break;
                        default:
                            System.out.println("Opção errada! Preste atenção Jogador!!");
                            break;
                    }
                } while (escolha!= 1 && escolha !=2);
                //2 OPCOES if casa 6 ou 7
                break;
            case 6:
                System.out.println("O campeão dos trolls apareceu!");
                System.out.println("Se inicia uma batalha mortal");
                System.out.println("-------------------------------");
                batalha=vocacao.atacar(trollChampion);
             if (!batalha){
                  System.out.println("Você está morto!");
                   return false;
               }
                vocacao.tomarPocao();
                vocacao.levelUp();
                i = 7;
                op=1;
                break;
            case 7:
                System.out.println("tesouro + historia");

                do {
                    System.out.println("1 0u 2");
                    escolha =scanner.nextInt();

                    switch (escolha){
                        case 1:
                            op=8;
                            break;
                        case 2:
                            op=9;

                            break;
                        case 3:
                            op=10;
                            break;
                        default:
                            System.out.println("Opção errada! Preste atenção Jogador!!");
                            break;
                    }
                } while (escolha<1 && escolha >3);
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
                i = 9;
                op = 1;
                break;
            case 9:
                System.out.println("tesouro mais historia");
                do {
                    System.out.println("1 0u 2");
                    escolha =scanner.nextInt();

                    switch (escolha){
                        case 1:
                            op=10;
                            break;
                        case 2:
                            op=11;

                            break;
                        default:
                            System.out.println("Opção errada! Preste atenção Jogador!!");
                            break;
                    }
                } while (escolha!= 1 && escolha !=2);
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
                i = 11;
                op=1;
                break;
            case 11:
                System.out.println("Historia sobre o mundo, preparação luta final");
                i = 12;
                op =1;
                break;
            case 12:

                System.out.println("Final boss");
                batalha=vocacao.atacar(boss);
             if (!batalha){
                  System.out.println("Você está morto!");
                   return false;
               }

                vocacao.levelUp();
                return true;


            default:
                break;
        }
        } while (vitoria == true);
        return false;
    }
}
