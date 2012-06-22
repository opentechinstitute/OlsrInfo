package net.commotionwireless.olsrinfo.datatypes;

/**
 * A network interface from the list of interfaces that <tt>olsrd</tt>
 * is aware of at runtime.
 * 
 * Written as part of the Commotion Wireless project
 * 
 * @author Hans-Christoph Steiner <hans@eds.org>
 * @see <a href="https://code.commotionwireless.net/projects/commotion/wiki/OLSR_Configuration_and_Management">OLSR Configuration and Management</a>
 */
public class Interface {
	public String name;
	public String state;
	public int olsrMTU;
	public boolean wireless;
	public String ipv4Address;
	public String netmask;
	public String broadcast;
	public String ipv6Address;
	public String multicast;
	public String kernelModule;
	public int addressLength;
	public int carrier;
	public int dormant;
	public String features;
	public String flags;
	public int linkMode;
	public String macAddress;
	public int ethernetMTU;
	public String operationalState;
	public int txQueueLength;
	public int collisions;
	public int multicastPackets;
	public int rxBytes;
	public int rxCompressed;
	public int rxCrcErrors;
	public int rxDropped;
	public int rxErrors;
	public int rxFifoErrors;
	public int rxFrameErrors;
	public int rxLengthErrors;
	public int rxMissedErrors;
	public int rxOverErrors;
	public int rxPackets;
	public int txAbortedErrors;
	public int txBytes;
	public int txCarrierErrors;
	public int txCompressed;
	public int txDropped;
	public int txErrors;
	public int txFifoErrors;
	public int txHeartbeatErrors;
	public int txPackets;
	public int txWindowErrors;
}
