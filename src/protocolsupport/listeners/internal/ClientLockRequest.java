package protocolsupport.listeners.internal;

import io.netty.buffer.ByteBuf;
import protocolsupport.listeners.InternalPluginMessageRequest.PluginMessageData;

public class ClientLockRequest extends PluginMessageData {

	@Override
	protected void read(ByteBuf from) {	}

	@Override
	protected void write(ByteBuf to) { }

}
