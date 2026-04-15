package k8;

import b5.d0;
import java.io.IOException;
import java.util.ArrayList;
import lh.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f11192b = new long[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11193c = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11194d = new ArrayList(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d0 f11197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f11199i;

    public a(d dVar, String str) {
        this.f11199i = dVar;
        this.f11191a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i10 = 0; i10 < 2; i10++) {
            sb.append(i10);
            this.f11193c.add(this.f11199i.f11204a.d(sb.toString()));
            sb.append(".tmp");
            this.f11194d.add(this.f11199i.f11204a.d(sb.toString()));
            sb.setLength(length);
        }
    }

    public final b a() {
        if (!this.f11195e || this.f11197g != null || this.f11196f) {
            return null;
        }
        ArrayList arrayList = this.f11193c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            d dVar = this.f11199i;
            if (i10 >= size) {
                this.f11198h++;
                return new b(dVar, this);
            }
            if (!dVar.f11219p.q((y) arrayList.get(i10))) {
                try {
                    dVar.y(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i10++;
        }
    }
}
