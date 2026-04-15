package a8;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public interface b extends Closeable {
    String getDatabaseName();

    a getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);
}
