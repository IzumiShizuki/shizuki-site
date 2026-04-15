.class public final Lj2/v0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lx0/s0;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/Choreographer;Lj2/t0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lj2/v0;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lj2/v0;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lj2/v0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lx0/s0;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lj2/v0;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj2/v0;->b:Ljava/lang/Object;

    .line 5
    new-instance p1, Lb5/d0;

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lb5/d0;-><init>(IZ)V

    iput-object p1, p0, Lj2/v0;->c:Ljava/lang/Object;

    return-void
.end method

.method private final a(Lic/k;Lyb/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lj2/v0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj2/t0;

    .line 4
    .line 5
    new-instance v1, Lhf/k;

    .line 6
    .line 7
    invoke-static {p2}, Lud/s;->p(Lyb/c;)Lyb/c;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v1, v2, p2}, Lhf/k;-><init>(ILyb/c;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lhf/k;->r()V

    .line 16
    .line 17
    .line 18
    new-instance p2, Lj2/u0;

    .line 19
    .line 20
    invoke-direct {p2, v1, p0, p1}, Lj2/u0;-><init>(Lhf/k;Lj2/v0;Lic/k;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, v0, Lj2/t0;->c:Landroid/view/Choreographer;

    .line 24
    .line 25
    iget-object v3, p0, Lj2/v0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Landroid/view/Choreographer;

    .line 28
    .line 29
    invoke-static {p1, v3}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-object p1, v0, Lj2/t0;->e:Ljava/lang/Object;

    .line 36
    .line 37
    monitor-enter p1

    .line 38
    :try_start_0
    iget-object v3, v0, Lj2/t0;->g:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    iget-boolean v3, v0, Lj2/t0;->j:Z

    .line 44
    .line 45
    if-nez v3, :cond_0

    .line 46
    .line 47
    iput-boolean v2, v0, Lj2/t0;->j:Z

    .line 48
    .line 49
    iget-object v2, v0, Lj2/t0;->c:Landroid/view/Choreographer;

    .line 50
    .line 51
    iget-object v3, v0, Lj2/t0;->k:Lj2/s0;

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p2

    .line 58
    goto :goto_1

    .line 59
    :cond_0
    :goto_0
    monitor-exit p1

    .line 60
    new-instance p1, Lb0/o1;

    .line 61
    .line 62
    const/16 v2, 0x11

    .line 63
    .line 64
    invoke-direct {p1, v2, v0, p2}, Lb0/o1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, p1}, Lhf/k;->w(Lic/k;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :goto_1
    monitor-exit p1

    .line 72
    throw p2

    .line 73
    :cond_1
    iget-object p1, p0, Lj2/v0;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Landroid/view/Choreographer;

    .line 76
    .line 77
    invoke-virtual {p1, p2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Lb0/o1;

    .line 81
    .line 82
    const/16 v0, 0x12

    .line 83
    .line 84
    invoke-direct {p1, v0, p0, p2}, Lb0/o1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, p1}, Lhf/k;->w(Lic/k;)V

    .line 88
    .line 89
    .line 90
    :goto_2
    invoke-virtual {v1}, Lhf/k;->q()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
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


# virtual methods
.method public final G(Lyb/h;)Lyb/h;
    .locals 1

    .line 1
    iget v0, p0, Lj2/v0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lud/b;->C(Lyb/f;Lyb/h;)Lyb/h;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lud/b;->C(Lyb/f;Lyb/h;)Lyb/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final L(Lyb/g;)Lyb/h;
    .locals 1

    .line 1
    iget v0, p0, Lj2/v0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lud/b;->z(Lyb/f;Lyb/g;)Lyb/h;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lud/b;->z(Lyb/f;Lyb/g;)Lyb/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final R(Lyb/g;)Lyb/f;
    .locals 1

    .line 1
    iget v0, p0, Lj2/v0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lud/b;->o(Lyb/f;Lyb/g;)Lyb/f;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, Lud/b;->o(Lyb/f;Lyb/g;)Lyb/f;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final getKey()Lyb/g;
    .locals 1

    .line 1
    iget v0, p0, Lj2/v0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lx0/r0;->b:Lx0/r0;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    sget-object v0, Lx0/r0;->b:Lx0/r0;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final k(Lic/k;Lyb/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lj2/v0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Lx0/f1;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Lx0/f1;

    .line 12
    .line 13
    iget v1, v0, Lx0/f1;->g:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Lx0/f1;->g:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lx0/f1;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Lx0/f1;-><init>(Lj2/v0;Lyb/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Lx0/f1;->e:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, Lzb/a;->a:Lzb/a;

    .line 33
    .line 34
    iget v2, v0, Lx0/f1;->g:I

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    const/4 v4, 0x1

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    iget-object p1, v0, Lx0/f1;->d:Lic/k;

    .line 57
    .line 58
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, Lj2/v0;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p2, Lb5/d0;

    .line 68
    .line 69
    iput-object p1, v0, Lx0/f1;->d:Lic/k;

    .line 70
    .line 71
    iput v4, v0, Lx0/f1;->g:I

    .line 72
    .line 73
    invoke-virtual {p2}, Lb5/d0;->m()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_4

    .line 78
    .line 79
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    new-instance v2, Lhf/k;

    .line 83
    .line 84
    invoke-static {v0}, Lud/s;->p(Lyb/c;)Lyb/c;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-direct {v2, v4, v5}, Lhf/k;-><init>(ILyb/c;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Lhf/k;->r()V

    .line 92
    .line 93
    .line 94
    iget-object v4, p2, Lb5/d0;->b:Ljava/lang/Object;

    .line 95
    .line 96
    monitor-enter v4

    .line 97
    :try_start_0
    iget-object v5, p2, Lb5/d0;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v5, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    .line 103
    .line 104
    monitor-exit v4

    .line 105
    new-instance v4, Lee/j;

    .line 106
    .line 107
    const/16 v5, 0x8

    .line 108
    .line 109
    invoke-direct {v4, v5, p2, v2}, Lee/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4}, Lhf/k;->w(Lic/k;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Lhf/k;->q()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    if-ne p2, v1, :cond_5

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 123
    .line 124
    :goto_1
    if-ne p2, v1, :cond_6

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_6
    :goto_2
    iget-object p2, p0, Lj2/v0;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p2, Lx0/s0;

    .line 130
    .line 131
    const/4 v2, 0x0

    .line 132
    iput-object v2, v0, Lx0/f1;->d:Lic/k;

    .line 133
    .line 134
    iput v3, v0, Lx0/f1;->g:I

    .line 135
    .line 136
    invoke-interface {p2, p1, v0}, Lx0/s0;->k(Lic/k;Lyb/c;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    if-ne p2, v1, :cond_7

    .line 141
    .line 142
    :goto_3
    move-object p2, v1

    .line 143
    :cond_7
    :goto_4
    return-object p2

    .line 144
    :catchall_0
    move-exception p1

    .line 145
    monitor-exit v4

    .line 146
    throw p1

    .line 147
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lj2/v0;->a(Lic/k;Lyb/c;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    return-object p1

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
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

.method public final y(Lic/n;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lj2/v0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2, p0}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-interface {p1, p2, p0}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
