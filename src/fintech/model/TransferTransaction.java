package fintech.model;

/**
 * @author 12S21007 Dame J Sitinjak
 * @author 12S21015 Sitogab Antonio Octavianus Girsang
 */

public class TransferTransaction extends Transaction {


private String recipientName;
private String senderName;

public TransferTransaction(String senderName, String recipientName, double amount, String postedAt, String note) {
    super(senderName, amount, postedAt, note);
    this.recipientName = recipientName;
}

public String getRecipientName() {
    return recipientName;
}

public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
}

public String getSenderName() {
    return senderName;
}

public void setSenderName(String senderName) {
    this.senderName = senderName;
}



@Override
public String toString() {
    return this.getId() + "|" + this.getName() + "|" + this.getRecipientName() + "|" + this.getAmount() + "|" + this.getPosted_at() + "|"
            + this.getNote();
}





}