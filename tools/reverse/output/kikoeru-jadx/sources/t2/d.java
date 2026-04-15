package t2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f20290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f20292c;

    public d() {
        this.f20290a = new StringBuilder(16);
        this.f20291b = new ArrayList();
        this.f20292c = new ArrayList();
        new ArrayList();
    }

    public final void a(g gVar) {
        StringBuilder sb = this.f20290a;
        int length = sb.length();
        sb.append(gVar.f20320b);
        List list = gVar.f20319a;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) list.get(i10);
                this.f20292c.add(new c(eVar.f20309a, eVar.f20310b + length, eVar.f20311c + length, eVar.f20312d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof g) {
            a((g) charSequence);
            return this;
        }
        this.f20290a.append(charSequence);
        return this;
    }

    public final void b(int i10) {
        ArrayList arrayList = this.f20291b;
        if (i10 >= arrayList.size()) {
            z2.a.b(i10 + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i10) {
            if (arrayList.isEmpty()) {
                z2.a.b("Nothing to pop.");
            }
            ((c) arrayList.remove(arrayList.size() - 1)).f20285c = this.f20290a.length();
        }
    }

    public final g c() {
        StringBuilder sb = this.f20290a;
        String string = sb.toString();
        ArrayList arrayList = this.f20292c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            int length = sb.length();
            int i11 = cVar.f20285c;
            if (i11 != Integer.MIN_VALUE) {
                length = i11;
            }
            if (length == Integer.MIN_VALUE) {
                z2.a.b("Item.end should be set first");
            }
            arrayList2.add(new e(cVar.f20283a, cVar.f20284b, length, cVar.f20286d));
        }
        return new g(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        boolean z10 = charSequence instanceof g;
        StringBuilder sb = this.f20290a;
        if (z10) {
            g gVar = (g) charSequence;
            int length = sb.length();
            sb.append((CharSequence) gVar.f20320b, i10, i11);
            List listA = h.a(gVar, i10, i11, null);
            if (listA != null) {
                int size = listA.size();
                for (int i12 = 0; i12 < size; i12++) {
                    e eVar = (e) listA.get(i12);
                    this.f20292c.add(new c(eVar.f20309a, eVar.f20310b + length, eVar.f20311c + length, eVar.f20312d));
                }
            }
            return this;
        }
        sb.append(charSequence, i10, i11);
        return this;
    }

    public d(g gVar) {
        this();
        a(gVar);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c3) {
        this.f20290a.append(c3);
        return this;
    }
}
