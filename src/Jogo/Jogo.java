package Jogo;


import Entidades.Npc;
import Entidades.Vendedor;
import Itens.ItemHeroi;
import Itens.ItemTipoHeroi;
import Entidades.Warrior;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        labirinto();

    }

    public static void labirinto(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<ItemHeroi> itensVendedor =  new ArrayList<>();
        ArrayList<ItemTipoHeroi> tipoHeroi = new ArrayList<>();


        int op = 0;
        int dificuldade = 0;
        int hp = 0;
        int damage = 0;
        int opcaoCompra = 0;
        do {
            System.out.println("Qual heroi você quer utilizar? \n1=Warrior\n2=Warlock\n3=Hunter");
            op = scanner.nextInt();



            switch (op){
                case 1:

                    System.out.println("Dificuldade? \n1= fácil\n2=difícil");
                    dificuldade = scanner.nextInt();
                    if (dificuldade == 1){
                        System.out.println("Tem 300 pontos de criação\n divida entre vida e força");
                        System.out.println("Vida: ");
                        hp = scanner.nextInt();
                        System.out.println("Força: ");
                        damage = scanner.nextInt();

                        int totalPontos = hp + damage;

                        if (totalPontos != 300){
                            System.out.println("Error!!");

                        }else {
                            Warrior warrior = new Warrior(20,"Knight of Roses", hp,damage);
                            Npc troll = new Npc("Troll", 150,5);
                            Npc trollChampion = new Npc("Troll Champion", 300,20);
                            System.out.println("Deseja comprar poções e armas? \n1= SIM \n2 =NÃO");
                            ItemHeroi avenger = new ItemHeroi("Avenger" , 50,tipoHeroi);
                            Vendedor vendedor =  new Vendedor(itensVendedor);
                            tipoHeroi.add(ItemTipoHeroi.WARRIOR);
                            itensVendedor.add(avenger);
                            opcaoCompra = scanner.nextInt();
                            if (opcaoCompra == 1){
                                 vendedor.venderItem();
                            }
                        }

                    } else if (dificuldade == 2) {

                    } else{
                        System.out.println("Error");
                    }


                    break;
                case 2:

                    System.out.println("Dificuldade?");
                    break;

                case 3:

                    System.out.println("Dificuldade?");
                    break;




            }



        }while (op < 1 || op > 3);



    }
}
