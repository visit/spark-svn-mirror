/**
 * $Revision: $
 * $Date: $
 *
 * Copyright (C) 2006 Jive Software. All rights reserved.
 *
 * This software is published under the terms of the GNU Lesser Public License (LGPL),
 * a copy of which is included in this distribution.
 */

package org.jivesoftware.spark.ui;

import org.jivesoftware.spark.util.log.Log;

import javax.swing.JComponent;
import javax.swing.TransferHandler;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Collection;

/**
 * Handler for drag and dropping of files unto a ChatWindow.
 */
public class ChatRoomTransferHandler extends TransferHandler {

    private ChatRoom chatRoom;

    private static final DataFlavor flavors[] = {DataFlavor.javaFileListFlavor, DataFlavor.stringFlavor};

    public ChatRoomTransferHandler(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public int getSourceActions(JComponent c) {
        return TransferHandler.COPY_OR_MOVE;
    }


    public boolean canImport(JComponent comp, DataFlavor flavor[]) {
        for (int i = 0, n = flavor.length; i < n; i++) {
            for (int j = 0, m = flavors.length; j < m; j++) {
                if (flavor[i].equals(flavors[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    protected void exportDone(JComponent c, Transferable data, int action) {

    }


    public Transferable createTransferable(JComponent comp) {
        if (comp instanceof TranscriptWindow) {
            return new TranscriptWindowTransferable((TranscriptWindow)comp);
        }

        return null;
    }

    public boolean importData(JComponent comp, Transferable t) {
        if (t.isDataFlavorSupported(flavors[0])) {
            try {
                Object o = t.getTransferData(flavors[0]);
                if (o instanceof java.util.Collection) {
                    Collection files = (Collection)o;

                    // Otherwise fire files dropped event.
                    chatRoom.fireFileDropListeners(files);
                    return true;
                }
            }
            catch (UnsupportedFlavorException e) {
                Log.error(e);
            }
            catch (IOException e) {
                Log.error(e);
            }
        }
        else if (t.isDataFlavorSupported(flavors[1])) {
            try {
                Object o = t.getTransferData(flavors[1]);
                if (o instanceof String) {
                    // Otherwise fire files dropped event.
                    chatRoom.getChatInputEditor().insert((String)o);
                    return true;
                }
            }
            catch (Exception e) {
                Log.error(e);
            }

        }
        return false;
    }

    public class TranscriptWindowTransferable implements Transferable {

        private TranscriptWindow item;

        public TranscriptWindowTransferable(TranscriptWindow item) {
            this.item = item;
        }

        // Returns supported flavors
        public DataFlavor[] getTransferDataFlavors() {
            return new DataFlavor[]{DataFlavor.stringFlavor};
        }

        // Returns true if flavor is supported
        public boolean isDataFlavorSupported(DataFlavor flavor) {
            return DataFlavor.stringFlavor.equals(flavor);
        }

        // Returns Selected Text
        public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
            if (!DataFlavor.stringFlavor.equals(flavor)) {
                throw new UnsupportedFlavorException(flavor);
            }
            return item.getSelectedText();
        }
    }
}
