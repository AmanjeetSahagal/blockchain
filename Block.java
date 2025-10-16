import java.util.Date;
import java.util.ArrayList;


public class Block {

	public String hash;
	public String previousHash;
	private String data;
	public ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	private long timeStamp;
	private int nonce;
	public String merkleRoot;
	

	//Block Constructor.
	public Block(String previousHash ) {
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash(); 
	}
	
	public String calculateHash() {
		String calculatedhash = StringUtil.applySha256( 
				previousHash +
				Long.toString(timeStamp) +
				Integer.toString(nonce) +
				data 
				);
		return calculatedhash;
	}
	
	public void mineBlock(int difficulty) {
		merkleRoot = StringUtil.getMerkleRoot(transactions);
		String target = new String(new char[difficulty]).replace('\0', '0');
		while (!hash.substring(0,difficulty).equals(target)) {
			nonce++;
			hash = calculateHash();
		}
		System.out.println("Block Mined!!!: " + hash);
	}
	
	public boolean addTransaction(Transaction transaction) {
		if (transaction == null) {
			return false;
		}
		if (previousHash != "0") {
			if (transaction.processTransaction() != true) {
				System.out.println("Transaction Failed to Process. Discarded.");
				return false;
			}
		}
		transactions.add(transaction);
		System.out.println("Transaction Successfully added to Block");
		return true;
	}
}