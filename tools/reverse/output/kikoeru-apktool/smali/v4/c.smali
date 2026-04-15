.class public final synthetic Lv4/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field public final synthetic a:Lv4/d;


# direct methods
.method public synthetic constructor <init>(Lv4/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv4/c;->a:Lv4/d;

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
.method public final onAudioFocusChange(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lv4/c;->a:Lv4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lv4/d;->c:Lv4/s;

    .line 7
    .line 8
    const/4 v2, -0x3

    .line 9
    const/4 v3, -0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eq p1, v2, :cond_4

    .line 12
    .line 13
    if-eq p1, v3, :cond_4

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    const/4 v3, -0x1

    .line 17
    if-eq p1, v3, :cond_2

    .line 18
    .line 19
    if-eq p1, v4, :cond_0

    .line 20
    .line 21
    const-string v0, "AudioFocusManager"

    .line 22
    .line 23
    const-string v1, "Unknown focus change type: "

    .line 24
    .line 25
    invoke-static {p1, v1, v0}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-virtual {v0, v2}, Lv4/d;->c(I)V

    .line 30
    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object p1, v1, Lv4/s;->a:Lv4/v;

    .line 35
    .line 36
    invoke-virtual {p1}, Lv4/v;->r()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p1, v4, v4, v0}, Lv4/v;->j2(IIZ)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void

    .line 44
    :cond_2
    if-eqz v1, :cond_3

    .line 45
    .line 46
    iget-object p1, v1, Lv4/s;->a:Lv4/v;

    .line 47
    .line 48
    invoke-virtual {p1}, Lv4/v;->r()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {p1, v3, v2, v1}, Lv4/v;->j2(IIZ)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {v0}, Lv4/d;->a()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v4}, Lv4/d;->c(I)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    if-eq p1, v3, :cond_6

    .line 63
    .line 64
    iget-object p1, v0, Lv4/d;->d:Lm4/d;

    .line 65
    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    iget p1, p1, Lm4/d;->a:I

    .line 69
    .line 70
    if-ne p1, v4, :cond_5

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_5
    const/4 p1, 0x4

    .line 74
    invoke-virtual {v0, p1}, Lv4/d;->c(I)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_6
    :goto_0
    if-eqz v1, :cond_7

    .line 79
    .line 80
    iget-object p1, v1, Lv4/s;->a:Lv4/v;

    .line 81
    .line 82
    invoke-virtual {p1}, Lv4/v;->r()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    const/4 v2, 0x0

    .line 87
    invoke-virtual {p1, v2, v4, v1}, Lv4/v;->j2(IIZ)V

    .line 88
    .line 89
    .line 90
    :cond_7
    const/4 p1, 0x3

    .line 91
    invoke-virtual {v0, p1}, Lv4/d;->c(I)V

    .line 92
    .line 93
    .line 94
    return-void
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
