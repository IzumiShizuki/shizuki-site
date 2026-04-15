package j6;

import i7.p2;
import java.util.ArrayDeque;
import r5.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f10504a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f10505b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f10506c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p2 f10507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10510g;

    public final long a(o oVar, int i10) {
        byte[] bArr = this.f10504a;
        oVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (bArr[i11] & 255));
        }
        return j10;
    }
}
