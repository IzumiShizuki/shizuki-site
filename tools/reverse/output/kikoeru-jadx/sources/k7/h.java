package k7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11184d;

    public h(int i10, int i11, long j10, long j11) {
        this.f11181a = i10;
        this.f11182b = i11;
        this.f11183c = j10;
        this.f11184d = j11;
    }

    public static h a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            h hVar = new h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return hVar;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f11181a);
            dataOutputStream.writeInt(this.f11182b);
            dataOutputStream.writeLong(this.f11183c);
            dataOutputStream.writeLong(this.f11184d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            if (this.f11182b == hVar.f11182b && this.f11183c == hVar.f11183c && this.f11181a == hVar.f11181a && this.f11184d == hVar.f11184d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11182b), Long.valueOf(this.f11183c), Integer.valueOf(this.f11181a), Long.valueOf(this.f11184d));
    }
}
