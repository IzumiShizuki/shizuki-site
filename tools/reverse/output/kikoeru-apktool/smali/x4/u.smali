.class public final Lx4/u;
.super Landroid/media/AudioTrack$StreamEventCallback;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic a:Ltc/b0;


# direct methods
.method public constructor <init>(Ltc/b0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx4/u;->a:Ltc/b0;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/AudioTrack$StreamEventCallback;-><init>()V

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
.method public final onDataRequest(Landroid/media/AudioTrack;I)V
    .locals 0

    .line 1
    iget-object p2, p0, Lx4/u;->a:Ltc/b0;

    .line 2
    .line 3
    iget-object p2, p2, Ltc/b0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p2, Lx4/v;

    .line 6
    .line 7
    iget-object p2, p2, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, Lx4/u;->a:Ltc/b0;

    .line 17
    .line 18
    iget-object p1, p1, Ltc/b0;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lx4/v;

    .line 21
    .line 22
    iget-object p2, p1, Lx4/v;->r:Lr/y1;

    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    iget-boolean p1, p1, Lx4/v;->V:Z

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object p1, p2, Lr/y1;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Lx4/x;

    .line 33
    .line 34
    iget-object p1, p1, Lg5/q;->F:Lv4/w;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1}, Lv4/w;->a()V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public final onPresentationEnded(Landroid/media/AudioTrack;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/u;->a:Ltc/b0;

    .line 2
    .line 3
    iget-object v0, v0, Ltc/b0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lx4/v;

    .line 6
    .line 7
    iget-object v0, v0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p1, p0, Lx4/u;->a:Ltc/b0;

    .line 17
    .line 18
    iget-object p1, p1, Ltc/b0;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lx4/v;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p1, Lx4/v;->U:Z

    .line 24
    .line 25
    return-void
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

.method public final onTearDown(Landroid/media/AudioTrack;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/u;->a:Ltc/b0;

    .line 2
    .line 3
    iget-object v0, v0, Ltc/b0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lx4/v;

    .line 6
    .line 7
    iget-object v0, v0, Lx4/v;->v:Landroid/media/AudioTrack;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, Lx4/u;->a:Ltc/b0;

    .line 17
    .line 18
    iget-object p1, p1, Ltc/b0;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lx4/v;

    .line 21
    .line 22
    iget-object v0, p1, Lx4/v;->r:Lr/y1;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-boolean p1, p1, Lx4/v;->V:Z

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object p1, v0, Lr/y1;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Lx4/x;

    .line 33
    .line 34
    iget-object p1, p1, Lg5/q;->F:Lv4/w;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1}, Lv4/w;->a()V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
