package x4;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f24595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f24596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f24597c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f24597c = eVar;
        this.f24595a = contentResolver;
        this.f24596b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        e eVar = this.f24597c;
        eVar.a(b.c(eVar.f24598a, eVar.f24606i, eVar.f24605h));
    }
}
