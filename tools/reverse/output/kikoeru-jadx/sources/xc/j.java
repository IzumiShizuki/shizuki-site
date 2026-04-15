package xc;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f24935b;

    public /* synthetic */ j(l lVar, int i10) {
        this.f24934a = i10;
        this.f24935b = lVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f24934a) {
            case 0:
                List listW = ud.b.w(zc.e.a(this.f24935b.f24943a.f2576d, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                return listW.isEmpty() ? zc.g.f26696a : new zc.i(0, listW);
            default:
                return this.f24935b.f24943a.f2576d.e();
        }
    }
}
