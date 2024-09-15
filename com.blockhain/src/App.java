import java.util.ArrayList;

public class App {

    ArrayList<Block> blockchain = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        
        String[] genesisTransactions = {"10 Bitcoin", "-25 Bitcoin"};
        Block genesisBlock = new Block(0, genesisTransactions);


        System.out.println(genesisBlock.getBlockHash());
    }
} 
