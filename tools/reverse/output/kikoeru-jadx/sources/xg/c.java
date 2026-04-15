package xg;

import b5.d0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import jc.l;
import lh.h0;
import lh.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f25034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f25035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f25036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d0 f25039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f25041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f25042j;

    public c(g gVar, String str) {
        l.e(str, "key");
        this.f25042j = gVar;
        this.f25033a = str;
        gVar.getClass();
        this.f25034b = new long[2];
        this.f25035c = new ArrayList();
        this.f25036d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i10 = 0; i10 < 2; i10++) {
            sb.append(i10);
            ArrayList arrayList = this.f25035c;
            y yVar = this.f25042j.f25054a;
            String string = sb.toString();
            l.d(string, "toString(...)");
            arrayList.add(yVar.d(string));
            sb.append(".tmp");
            ArrayList arrayList2 = this.f25036d;
            y yVar2 = this.f25042j.f25054a;
            String string2 = sb.toString();
            l.d(string2, "toString(...)");
            arrayList2.add(yVar2.d(string2));
            sb.setLength(length);
        }
    }

    public final d a() {
        TimeZone timeZone = wg.g.f24231a;
        if (!this.f25037e) {
            return null;
        }
        g gVar = this.f25042j;
        if (!gVar.f25065l && (this.f25039g != null || this.f25038f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.f25034b.clone();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                h0 h0VarL = gVar.f25055b.L((y) this.f25035c.get(i10));
                if (!gVar.f25065l) {
                    this.f25040h++;
                    h0VarL = new b(h0VarL, gVar, this);
                }
                arrayList.add(h0VarL);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    wg.e.b((h0) it.next());
                }
                try {
                    gVar.D(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new d(this.f25042j, this.f25033a, this.f25041i, arrayList, jArr);
    }
}
