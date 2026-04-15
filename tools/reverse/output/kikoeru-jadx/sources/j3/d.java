package j3;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends jc.m implements ic.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f10122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f10123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f10124e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10125b;

    static {
        int i10 = 0;
        f10122c = new d(i10, 0);
        f10123d = new d(i10, 1);
        f10124e = new d(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        super(i10);
        this.f10125b = i11;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f10125b) {
        }
        return UUID.randomUUID();
    }
}
