package n5;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final androidx.media3.exoplayer.offline.i f15384h = new androidx.media3.exoplayer.offline.i(15);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final androidx.media3.exoplayer.offline.i f15385i = new androidx.media3.exoplayer.offline.i(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15386a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15392g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s[] f15388c = new s[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15387b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15389d = -1;

    public t(int i10) {
        this.f15386a = i10;
    }

    public final void a(float f10, int i10) {
        s sVar;
        int i11 = this.f15389d;
        ArrayList arrayList = this.f15387b;
        if (i11 != 1) {
            Collections.sort(arrayList, f15384h);
            this.f15389d = 1;
        }
        int i12 = this.f15392g;
        s[] sVarArr = this.f15388c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f15392g = i13;
            sVar = sVarArr[i13];
        } else {
            sVar = new s();
        }
        int i14 = this.f15390e;
        this.f15390e = i14 + 1;
        sVar.f15381a = i14;
        sVar.f15382b = i10;
        sVar.f15383c = f10;
        arrayList.add(sVar);
        this.f15391f += i10;
        while (true) {
            int i15 = this.f15391f;
            int i16 = this.f15386a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            s sVar2 = (s) arrayList.get(0);
            int i18 = sVar2.f15382b;
            if (i18 <= i17) {
                this.f15391f -= i18;
                arrayList.remove(0);
                int i19 = this.f15392g;
                if (i19 < 5) {
                    this.f15392g = i19 + 1;
                    sVarArr[i19] = sVar2;
                }
            } else {
                sVar2.f15382b = i18 - i17;
                this.f15391f -= i17;
            }
        }
    }

    public final float b() {
        int i10 = this.f15389d;
        ArrayList arrayList = this.f15387b;
        if (i10 != 0) {
            Collections.sort(arrayList, f15385i);
            this.f15389d = 0;
        }
        float f10 = 0.5f * this.f15391f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            s sVar = (s) arrayList.get(i12);
            i11 += sVar.f15382b;
            if (i11 >= f10) {
                return sVar.f15383c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((s) arrayList.get(arrayList.size() - 1)).f15383c;
    }
}
