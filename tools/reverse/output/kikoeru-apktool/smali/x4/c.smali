.class public final Lx4/c;
.super Landroid/media/AudioDeviceCallback;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic a:Lx4/e;


# direct methods
.method public constructor <init>(Lx4/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx4/c;->a:Lx4/e;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lx4/c;->a:Lx4/e;

    .line 2
    .line 3
    iget-object v0, p1, Lx4/e;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p1, Lx4/e;->i:Lm4/d;

    .line 6
    .line 7
    iget-object v2, p1, Lx4/e;->h:Lr/y1;

    .line 8
    .line 9
    invoke-static {v0, v1, v2}, Lx4/b;->c(Landroid/content/Context;Lm4/d;Lr/y1;)Lx4/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Lx4/e;->a(Lx4/b;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx4/c;->a:Lx4/e;

    .line 2
    .line 3
    iget-object v0, v0, Lx4/e;->h:Lr/y1;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lp4/c0;->l(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lx4/c;->a:Lx4/e;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p1, Lx4/e;->h:Lr/y1;

    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, Lx4/c;->a:Lx4/e;

    .line 17
    .line 18
    iget-object v0, p1, Lx4/e;->a:Landroid/content/Context;

    .line 19
    .line 20
    iget-object v1, p1, Lx4/e;->i:Lm4/d;

    .line 21
    .line 22
    iget-object v2, p1, Lx4/e;->h:Lr/y1;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Lx4/b;->c(Landroid/content/Context;Lm4/d;Lr/y1;)Lx4/b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1, v0}, Lx4/e;->a(Lx4/b;)V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method
