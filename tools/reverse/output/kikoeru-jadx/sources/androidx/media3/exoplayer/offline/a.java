package androidx.media3.exoplayer.offline;

import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Closeable f869b;

    public /* synthetic */ a(Closeable closeable, int i10) {
        this.f868a = i10;
        this.f869b = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f868a) {
            case 0:
                ((Cursor) this.f869b).close();
                break;
            default:
                ((k8.b) this.f869b).close();
                break;
        }
    }
}
