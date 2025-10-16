import java.security.PublicKey;

public class TransactionOutput {
	public String id;
	public PublicKey recipient; //new owner of coins
	public float value; //amount they own
	public String parentTransactionId;
	
	public TransactionOutput(PublicKey recipient, float value, String parentTransactionId) {
		this.recipient = recipient;
		this.value = value;
		this.parentTransactionId = parentTransactionId;
		this.id = StringUtil.applySha256(StringUtil.getStringFromKey(recipient) + Float.toString(value)+parentTransactionId);
	}
	
	public boolean isMine(PublicKey publicKey) {
		return (publicKey == recipient);
	}
}
