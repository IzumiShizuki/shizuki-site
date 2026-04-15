package c7;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends MediaSession.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f3728a;

    public t0(u0 u0Var) {
        this.f3728a = u0Var;
    }

    public static void b(w0 w0Var) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        MediaSession mediaSession = w0Var.f3739a;
        String str = null;
        if (i10 >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e10) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e10);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        w0Var.f(new k1(-1, -1, str));
    }

    public final w0 a() {
        w0 w0Var;
        synchronized (this.f3728a.f3730a) {
            w0Var = (w0) this.f3728a.f3733d.get();
        }
        if (w0Var == null || this.f3728a != w0Var.b()) {
            return null;
        }
        return w0Var;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        g8.d dVar;
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        e1.t(bundle);
        b(w0VarA);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    d1 d1Var = w0VarA.f3741c;
                    h hVarA = d1Var.a();
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", hVarA == null ? null : hVarA.asBinder());
                    synchronized (d1Var.f3606a) {
                        dVar = d1Var.f3609d;
                    }
                    if (dVar != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(dVar));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.f3728a.b((q0) lc.b.o(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), q0.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (bundle != null) {
                    this.f3728a.c((q0) lc.b.o(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), q0.CREATOR), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.f3728a.q((q0) lc.b.o(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), q0.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                List list = w0VarA.f3746h;
                if (list != null && bundle != null) {
                    int i10 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    b1 b1Var = (i10 < 0 || i10 >= list.size()) ? null : (b1) list.get(i10);
                    if (b1Var != null) {
                        this.f3728a.q(b1Var.f3590a);
                    }
                }
            } else {
                this.f3728a.d(str, bundle, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        e1.t(bundle);
        b(w0VarA);
        try {
            boolean zEquals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            u0 u0Var = this.f3728a;
            if (zEquals) {
                if (bundle != null) {
                    Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    e1.t(bundle2);
                    u0Var.l(uri, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                u0Var.m();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                if (bundle != null) {
                    String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    e1.t(bundle3);
                    u0Var.n(string, bundle3);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                if (bundle != null) {
                    String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    e1.t(bundle4);
                    u0Var.o(string2, bundle4);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                if (bundle != null) {
                    Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    e1.t(bundle5);
                    u0Var.p(uri2, bundle5);
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                if (bundle != null) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                if (bundle != null) {
                    u0Var.w(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                if (bundle != null) {
                    u0Var.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                if (bundle != null) {
                    q1 q1Var = (q1) lc.b.o(bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), q1.CREATOR);
                    e1.t(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    u0Var.v(q1Var);
                }
            } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                u0Var.e(str, bundle);
            } else if (bundle != null) {
                u0Var.t(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        b(w0VarA);
        this.f3728a.f();
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return false;
        }
        b(w0VarA);
        boolean zG = this.f3728a.g(intent);
        w0VarA.f(null);
        return zG || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        b(w0VarA);
        this.f3728a.h();
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        b(w0VarA);
        this.f3728a.i();
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        e1.t(bundle);
        b(w0VarA);
        this.f3728a.j(str, bundle);
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        e1.t(bundle);
        b(w0VarA);
        this.f3728a.k(str, bundle);
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        e1.t(bundle);
        b(w0VarA);
        this.f3728a.l(uri, bundle);
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        b(w0VarA);
        this.f3728a.m();
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        e1.t(bundle);
        b(w0VarA);
        this.f3728a.n(str, bundle);
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        e1.t(bundle);
        b(w0VarA);
        this.f3728a.o(str, bundle);
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        e1.t(bundle);
        b(w0VarA);
        this.f3728a.p(uri, bundle);
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        b(w0VarA);
        this.f3728a.r();
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j10) {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        b(w0VarA);
        this.f3728a.s(j10);
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f10) {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        b(w0VarA);
        this.f3728a.t(f10);
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        b(w0VarA);
        this.f3728a.u(q1.a(rating));
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        b(w0VarA);
        this.f3728a.y();
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        b(w0VarA);
        this.f3728a.z();
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j10) {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        b(w0VarA);
        this.f3728a.A(j10);
        w0VarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        w0 w0VarA = a();
        if (w0VarA == null) {
            return;
        }
        b(w0VarA);
        this.f3728a.B();
        w0VarA.f(null);
    }
}
