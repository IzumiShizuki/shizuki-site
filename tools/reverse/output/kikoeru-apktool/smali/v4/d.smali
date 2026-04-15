.class public final Lv4/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lxa/i;

.field public final b:Landroid/os/Handler;

.field public final c:Lv4/s;

.field public d:Lm4/d;

.field public e:I

.field public f:I

.field public g:F

.field public h:Ln4/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lv4/s;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lv4/d;->g:F

    .line 7
    .line 8
    new-instance v0, Lv4/b;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p1, v1}, Lv4/b;-><init>(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lua/l;->U(Lxa/i;)Lxa/i;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lv4/d;->a:Lxa/i;

    .line 19
    .line 20
    iput-object p3, p0, Lv4/d;->c:Lv4/s;

    .line 21
    .line 22
    iput-object p2, p0, Lv4/d;->b:Landroid/os/Handler;

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput p1, p0, Lv4/d;->e:I

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget v0, p0, Lv4/d;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lv4/d;->h:Ln4/b;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Lv4/d;->a:Lxa/i;

    .line 14
    .line 15
    invoke-interface {v0}, Lxa/i;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/media/AudioManager;

    .line 20
    .line 21
    iget-object v1, p0, Lv4/d;->h:Ln4/b;

    .line 22
    .line 23
    sget v2, Lp4/c0;->a:I

    .line 24
    .line 25
    const/16 v3, 0x1a

    .line 26
    .line 27
    if-lt v2, v3, :cond_1

    .line 28
    .line 29
    iget-object v1, v1, Ln4/b;->f:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lk1/g;->i(Ljava/lang/Object;)Landroid/media/AudioFocusRequest;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v0, v1}, Lk1/g;->a(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iget-object v1, v1, Ln4/b;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    return-void
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
.end method

.method public final b(Lm4/d;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lv4/d;->d:Lm4/d;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lud/n;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    iput-object p1, p0, Lv4/d;->d:Lm4/d;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    :goto_0
    :pswitch_0
    const/4 v3, 0x0

    .line 16
    goto :goto_2

    .line 17
    :cond_0
    iget v2, p1, Lm4/d;->c:I

    .line 18
    .line 19
    const/4 v3, 0x3

    .line 20
    const/4 v4, 0x2

    .line 21
    const-string v5, "AudioFocusManager"

    .line 22
    .line 23
    packed-switch v2, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    :pswitch_1
    const-string p1, "Unidentified audio usage: "

    .line 27
    .line 28
    invoke-static {v2, p1, v5}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_2
    const/4 v3, 0x4

    .line 33
    goto :goto_2

    .line 34
    :pswitch_3
    iget p1, p1, Lm4/d;->a:I

    .line 35
    .line 36
    if-ne p1, v1, :cond_1

    .line 37
    .line 38
    :pswitch_4
    const/4 v3, 0x2

    .line 39
    goto :goto_2

    .line 40
    :goto_1
    :pswitch_5
    const/4 v3, 0x1

    .line 41
    goto :goto_2

    .line 42
    :pswitch_6
    const-string p1, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."

    .line 43
    .line 44
    invoke-static {v5, p1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_2
    :pswitch_7
    iput v3, p0, Lv4/d;->f:I

    .line 49
    .line 50
    if-eq v3, v1, :cond_2

    .line 51
    .line 52
    if-nez v3, :cond_3

    .line 53
    .line 54
    :cond_2
    const/4 v0, 0x1

    .line 55
    :cond_3
    const-string p1, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."

    .line 56
    .line 57
    invoke-static {p1, v0}, Lp4/c;->b(Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    :cond_4
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_3
        :pswitch_7
        :pswitch_7
        :pswitch_5
        :pswitch_1
        :pswitch_2
    .end packed-switch
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

.method public final c(I)V
    .locals 3

    .line 1
    iget v0, p0, Lv4/d;->e:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iput p1, p0, Lv4/d;->e:I

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    if-ne p1, v0, :cond_1

    .line 10
    .line 11
    const p1, 0x3e4ccccd    # 0.2f

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 16
    .line 17
    :goto_0
    iget v0, p0, Lv4/d;->g:F

    .line 18
    .line 19
    cmpl-float v0, v0, p1

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    iput p1, p0, Lv4/d;->g:F

    .line 25
    .line 26
    iget-object p1, p0, Lv4/d;->c:Lv4/s;

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    iget-object p1, p1, Lv4/s;->a:Lv4/v;

    .line 31
    .line 32
    iget v0, p1, Lv4/v;->U:F

    .line 33
    .line 34
    iget-object v1, p1, Lv4/v;->z:Lv4/d;

    .line 35
    .line 36
    iget v1, v1, Lv4/d;->g:F

    .line 37
    .line 38
    mul-float v0, v0, v1

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const/4 v2, 0x1

    .line 46
    invoke-virtual {p1, v2, v1, v0}, Lv4/v;->a2(IILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_3
    :goto_1
    return-void
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

.method public final d(IZ)I
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p1, v1, :cond_a

    .line 4
    .line 5
    iget p1, p0, Lv4/d;->f:I

    .line 6
    .line 7
    if-ne p1, v1, :cond_a

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    const/4 v3, -0x1

    .line 11
    if-eqz p2, :cond_7

    .line 12
    .line 13
    iget p2, p0, Lv4/d;->e:I

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    if-ne p2, v4, :cond_0

    .line 17
    .line 18
    goto/16 :goto_5

    .line 19
    .line 20
    :cond_0
    iget-object p2, p0, Lv4/d;->h:Ln4/b;

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    if-nez p2, :cond_2

    .line 26
    .line 27
    new-instance p2, La0/a;

    .line 28
    .line 29
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    sget-object v5, Lm4/d;->g:Lm4/d;

    .line 33
    .line 34
    iput-object v5, p2, La0/a;->c:Ljava/lang/Object;

    .line 35
    .line 36
    iput p1, p2, La0/a;->a:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    new-instance p1, La0/a;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iget v5, p2, Ln4/b;->a:I

    .line 45
    .line 46
    iput v5, p1, La0/a;->a:I

    .line 47
    .line 48
    iget-object v5, p2, Ln4/b;->d:Lm4/d;

    .line 49
    .line 50
    iput-object v5, p1, La0/a;->c:Ljava/lang/Object;

    .line 51
    .line 52
    iget-boolean p2, p2, Ln4/b;->e:Z

    .line 53
    .line 54
    iput-boolean p2, p1, La0/a;->b:Z

    .line 55
    .line 56
    move-object p2, p1

    .line 57
    :goto_0
    iget-object p1, p0, Lv4/d;->d:Lm4/d;

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    iget v5, p1, Lm4/d;->a:I

    .line 62
    .line 63
    if-ne v5, v1, :cond_3

    .line 64
    .line 65
    const/4 v5, 0x1

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    const/4 v5, 0x0

    .line 68
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iput-object p1, p2, La0/a;->c:Ljava/lang/Object;

    .line 72
    .line 73
    iput-boolean v5, p2, La0/a;->b:Z

    .line 74
    .line 75
    new-instance v8, Lv4/c;

    .line 76
    .line 77
    invoke-direct {v8, p0}, Lv4/c;-><init>(Lv4/d;)V

    .line 78
    .line 79
    .line 80
    iget-object v9, p0, Lv4/d;->b:Landroid/os/Handler;

    .line 81
    .line 82
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance v6, Ln4/b;

    .line 86
    .line 87
    iget v7, p2, La0/a;->a:I

    .line 88
    .line 89
    iget-object p1, p2, La0/a;->c:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v10, p1

    .line 92
    check-cast v10, Lm4/d;

    .line 93
    .line 94
    iget-boolean v11, p2, La0/a;->b:Z

    .line 95
    .line 96
    invoke-direct/range {v6 .. v11}, Ln4/b;-><init>(ILandroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/os/Handler;Lm4/d;Z)V

    .line 97
    .line 98
    .line 99
    iput-object v6, p0, Lv4/d;->h:Ln4/b;

    .line 100
    .line 101
    :goto_2
    iget-object p1, p0, Lv4/d;->a:Lxa/i;

    .line 102
    .line 103
    invoke-interface {p1}, Lxa/i;->get()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, Landroid/media/AudioManager;

    .line 108
    .line 109
    iget-object p2, p0, Lv4/d;->h:Ln4/b;

    .line 110
    .line 111
    sget v5, Lp4/c0;->a:I

    .line 112
    .line 113
    const/16 v6, 0x1a

    .line 114
    .line 115
    if-lt v5, v6, :cond_4

    .line 116
    .line 117
    iget-object p2, p2, Ln4/b;->f:Ljava/lang/Object;

    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-static {p2}, Lk1/g;->i(Ljava/lang/Object;)Landroid/media/AudioFocusRequest;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-static {p1, p2}, Lk1/g;->y(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    goto :goto_4

    .line 131
    :cond_4
    iget-object v5, p2, Ln4/b;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 132
    .line 133
    iget-object v6, p2, Ln4/b;->d:Lm4/d;

    .line 134
    .line 135
    iget v7, v6, Lm4/d;->b:I

    .line 136
    .line 137
    and-int/2addr v7, v1

    .line 138
    if-ne v7, v1, :cond_5

    .line 139
    .line 140
    :pswitch_0
    const/4 v0, 0x1

    .line 141
    goto :goto_3

    .line 142
    :cond_5
    iget v6, v6, Lm4/d;->c:I

    .line 143
    .line 144
    packed-switch v6, :pswitch_data_0

    .line 145
    .line 146
    .line 147
    :pswitch_1
    const/4 v0, 0x3

    .line 148
    goto :goto_3

    .line 149
    :pswitch_2
    const/16 v0, 0xa

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :pswitch_3
    const/4 v0, 0x2

    .line 153
    goto :goto_3

    .line 154
    :pswitch_4
    const/4 v0, 0x5

    .line 155
    goto :goto_3

    .line 156
    :pswitch_5
    const/4 v0, 0x4

    .line 157
    goto :goto_3

    .line 158
    :pswitch_6
    const/16 v0, 0x8

    .line 159
    .line 160
    :goto_3
    :pswitch_7
    iget p2, p2, Ln4/b;->a:I

    .line 161
    .line 162
    invoke-virtual {p1, v5, v0, p2}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    :goto_4
    if-ne p1, v1, :cond_6

    .line 167
    .line 168
    invoke-virtual {p0, v4}, Lv4/d;->c(I)V

    .line 169
    .line 170
    .line 171
    return v1

    .line 172
    :cond_6
    invoke-virtual {p0, v1}, Lv4/d;->c(I)V

    .line 173
    .line 174
    .line 175
    return v3

    .line 176
    :cond_7
    iget p1, p0, Lv4/d;->e:I

    .line 177
    .line 178
    if-eq p1, v1, :cond_9

    .line 179
    .line 180
    if-eq p1, v2, :cond_8

    .line 181
    .line 182
    :goto_5
    return v1

    .line 183
    :cond_8
    return v0

    .line 184
    :cond_9
    return v3

    .line 185
    :cond_a
    invoke-virtual {p0}, Lv4/d;->a()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, v0}, Lv4/d;->c(I)V

    .line 189
    .line 190
    .line 191
    return v1

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
