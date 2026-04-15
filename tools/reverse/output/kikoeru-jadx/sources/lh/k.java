package lh;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f12585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f12586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f12587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f12588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f12589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f12590h;

    public k(boolean z10, boolean z11, y yVar, Long l10, Long l11, Long l12, Long l13, Map map) {
        jc.l.e(map, "extras");
        this.f12583a = z10;
        this.f12584b = z11;
        this.f12585c = yVar;
        this.f12586d = l10;
        this.f12587e = l11;
        this.f12588f = l12;
        this.f12589g = l13;
        this.f12590h = vb.w.B(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f12583a) {
            arrayList.add("isRegularFile");
        }
        if (this.f12584b) {
            arrayList.add("isDirectory");
        }
        Long l10 = this.f12586d;
        if (l10 != null) {
            arrayList.add("byteCount=" + l10.longValue());
        }
        Long l11 = this.f12587e;
        if (l11 != null) {
            arrayList.add("createdAt=" + l11.longValue());
        }
        Long l12 = this.f12588f;
        if (l12 != null) {
            arrayList.add("lastModifiedAt=" + l12.longValue());
        }
        Long l13 = this.f12589g;
        if (l13 != null) {
            arrayList.add("lastAccessedAt=" + l13.longValue());
        }
        Map map = this.f12590h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return vb.m.f0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ k(boolean z10, boolean z11, y yVar, Long l10, Long l11, Long l12, Long l13) {
        this(z10, z11, yVar, l10, l11, l12, l13, vb.s.f22820a);
    }
}
