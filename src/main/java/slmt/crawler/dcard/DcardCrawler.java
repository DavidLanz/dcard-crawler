package slmt.crawler.dcard;

import slmt.crawler.dcard.action.Action;
import slmt.crawler.dcard.action.TopAction;

public class DcardCrawler {
	
	public static final String VERSION = "0.2.1";

	public static void main(String[] args) {
		Action top = new TopAction();
		top.execute(args);
	}
}
