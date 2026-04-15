package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.database.Cursor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f5089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ContentValues f5091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f5093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f5094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f5095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f5096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f5097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f5098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f5099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f5100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String[] f5101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5102o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f5103p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f5104q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J f5105r;

    public s(J j10, int i10, I i11) {
        this.f5105r = j10;
        this.f5088a = i10;
        this.f5089b = i11;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i10 = this.f5088a;
        I i11 = this.f5089b;
        J j10 = this.f5105r;
        switch (i10) {
            case 1:
                j10.a(this.f5090c, this.f5091d, i11);
                break;
            case 2:
                j10.a(this.f5090c, this.f5100m, this.f5101n, i11);
                break;
            case 3:
                Cursor cursorA = j10.a(this.f5092e, this.f5090c, this.f5093f, this.f5094g, this.f5095h, this.f5096i, this.f5097j, this.f5098k, this.f5099l, i11);
                if (cursorA != null) {
                    cursorA.close();
                }
                break;
            case 4:
                j10.a(this.f5102o, this.f5103p, this.f5104q, i11);
                break;
            case 5:
                j10.a(this.f5102o, i11);
                break;
            case 6:
                j10.a(this.f5102o, this.f5103p, i11);
                break;
        }
    }
}
