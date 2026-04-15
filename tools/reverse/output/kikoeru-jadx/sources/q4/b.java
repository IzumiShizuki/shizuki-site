package q4;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f17710e;

    public b(int i10, long j10) {
        super(i10);
        this.f17708c = j10;
        this.f17709d = new ArrayList();
        this.f17710e = new ArrayList();
    }

    public final b h(int i10) {
        ArrayList arrayList = this.f17710e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) arrayList.get(i11);
            if (bVar.f17713b == i10) {
                return bVar;
            }
        }
        return null;
    }

    public final c i(int i10) {
        ArrayList arrayList = this.f17709d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = (c) arrayList.get(i11);
            if (cVar.f17713b == i10) {
                return cVar;
            }
        }
        return null;
    }

    @Override // q4.d
    public final String toString() {
        return d.c(this.f17713b) + " leaves: " + Arrays.toString(this.f17709d.toArray()) + " containers: " + Arrays.toString(this.f17710e.toArray());
    }
}
