package mh;

import ic.n;
import java.io.IOException;
import jc.y;
import lh.b0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15205a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f15206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f15207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f15208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f15209e;

    public /* synthetic */ k(y yVar, b0 b0Var, y yVar2, y yVar3) {
        this.f15206b = yVar;
        this.f15207c = b0Var;
        this.f15208d = yVar2;
        this.f15209e = yVar3;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) throws IOException {
        int i10 = this.f15205a;
        int iIntValue = ((Integer) obj).intValue();
        Long l10 = (Long) obj2;
        switch (i10) {
            case 0:
                long jLongValue = l10.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    b0 b0Var = this.f15207c;
                    byte b10 = b0Var.readByte();
                    boolean z10 = (b10 & 1) == 1;
                    boolean z11 = (b10 & 2) == 2;
                    boolean z12 = (b10 & 4) == 4;
                    long j10 = z10 ? 5L : 1L;
                    if (z11) {
                        j10 += 4;
                    }
                    if (z12) {
                        j10 += 4;
                    }
                    if (jLongValue < j10) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z10) {
                        this.f15206b.f10838a = Integer.valueOf(b0Var.i());
                    }
                    if (z11) {
                        this.f15208d.f10838a = Integer.valueOf(b0Var.i());
                    }
                    if (z12) {
                        this.f15209e.f10838a = Integer.valueOf(b0Var.i());
                    }
                }
                return a0.f21526a;
            default:
                long jLongValue2 = l10.longValue();
                if (iIntValue == 1) {
                    y yVar = this.f15206b;
                    if (yVar.f10838a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    b0 b0Var2 = this.f15207c;
                    yVar.f10838a = Long.valueOf(b0Var2.k());
                    this.f15208d.f10838a = Long.valueOf(b0Var2.k());
                    this.f15209e.f10838a = Long.valueOf(b0Var2.k());
                }
                return a0.f21526a;
        }
    }

    public /* synthetic */ k(b0 b0Var, y yVar, y yVar2, y yVar3) {
        this.f15207c = b0Var;
        this.f15206b = yVar;
        this.f15208d = yVar2;
        this.f15209e = yVar3;
    }
}
