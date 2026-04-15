package yd;

import java.util.Arrays;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f26197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f26198h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26199f;

    static {
        e eVar = new e(new int[]{2, 2, 0}, false);
        f26197g = eVar;
        int i10 = eVar.f26167c;
        int i11 = eVar.f26166b;
        f26198h = (i11 == 1 && i10 == 9) ? new e(new int[]{2, 0, 0}, false) : new e(new int[]{i11, i10 + 1, 0}, false);
        new e(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int[] iArr, boolean z10) {
        super(Arrays.copyOf(iArr, iArr.length));
        l.e(iArr, "versionArray");
        this.f26199f = z10;
    }

    public final boolean b(e eVar) {
        l.e(eVar, "metadataVersionFromLanguageVersion");
        e eVar2 = this.f26199f ? f26197g : f26198h;
        int i10 = eVar2.f26166b;
        int i11 = eVar.f26166b;
        if (i10 > i11 || (i10 >= i11 && eVar2.f26167c > eVar.f26167c)) {
            eVar = eVar2;
        }
        int i12 = this.f26167c;
        boolean z10 = false;
        int i13 = this.f26166b;
        if ((i13 == 1 && i12 == 0) || i13 == 0) {
            return false;
        }
        int i14 = eVar.f26166b;
        if (i13 > i14 || (i13 >= i14 && i12 > eVar.f26167c)) {
            z10 = true;
        }
        return !z10;
    }
}
