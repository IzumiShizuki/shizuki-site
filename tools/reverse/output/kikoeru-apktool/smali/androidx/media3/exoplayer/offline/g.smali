.class public final synthetic Landroidx/media3/exoplayer/offline/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lt4/l;
.implements Lp4/k;
.implements Lb7/h1;
.implements Lb7/p3;
.implements Lp4/g;
.implements Lb7/n3;
.implements Lg5/x;
.implements Lm5/m;
.implements Lr5/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/offline/g;->a:I

    iput-object p2, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lw4/a;Lj5/u;Lj5/z;Ljava/io/IOException;Z)V
    .locals 0

    .line 2
    const/16 p1, 0x1a

    iput p1, p0, Landroidx/media3/exoplayer/offline/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lw4/a;Ljava/lang/Object;J)V
    .locals 0

    .line 3
    const/16 p1, 0x1b

    iput p1, p0, Landroidx/media3/exoplayer/offline/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lw4/a;Lv4/f;)V
    .locals 0

    .line 4
    const/16 p1, 0x19

    iput p1, p0, Landroidx/media3/exoplayer/offline/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/offline/g;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lw4/i;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :sswitch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lj5/z;

    .line 15
    .line 16
    check-cast p1, Lw4/i;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget v0, v0, Lj5/z;->a:I

    .line 22
    .line 23
    iput v0, p1, Lw4/i;->v:I

    .line 24
    .line 25
    return-void

    .line 26
    :sswitch_1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lv4/f;

    .line 29
    .line 30
    check-cast p1, Lw4/i;

    .line 31
    .line 32
    iget v1, p1, Lw4/i;->x:I

    .line 33
    .line 34
    iget v2, v0, Lv4/f;->g:I

    .line 35
    .line 36
    add-int/2addr v1, v2

    .line 37
    iput v1, p1, Lw4/i;->x:I

    .line 38
    .line 39
    iget v1, p1, Lw4/i;->y:I

    .line 40
    .line 41
    iget v0, v0, Lv4/f;->e:I

    .line 42
    .line 43
    add-int/2addr v1, v0

    .line 44
    iput v1, p1, Lw4/i;->y:I

    .line 45
    .line 46
    return-void

    .line 47
    :sswitch_2
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lm4/n0;

    .line 50
    .line 51
    check-cast p1, Lm4/w0;

    .line 52
    .line 53
    invoke-interface {p1, v0}, Lm4/w0;->Q(Lm4/n0;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :sswitch_3
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lv4/s;

    .line 60
    .line 61
    check-cast p1, Lm4/w0;

    .line 62
    .line 63
    iget-object v0, v0, Lv4/s;->a:Lv4/v;

    .line 64
    .line 65
    iget-object v0, v0, Lv4/v;->K:Lm4/l0;

    .line 66
    .line 67
    invoke-interface {p1, v0}, Lm4/w0;->h(Lm4/l0;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :sswitch_4
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lo4/c;

    .line 74
    .line 75
    check-cast p1, Lm4/w0;

    .line 76
    .line 77
    invoke-interface {p1, v0}, Lm4/w0;->s(Lo4/c;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :sswitch_5
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lm4/o1;

    .line 84
    .line 85
    check-cast p1, Lm4/w0;

    .line 86
    .line 87
    invoke-interface {p1, v0}, Lm4/w0;->S(Lm4/o1;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :sswitch_6
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Lm4/d;

    .line 94
    .line 95
    check-cast p1, Lm4/w0;

    .line 96
    .line 97
    invoke-interface {p1, v0}, Lm4/w0;->R(Lm4/d;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :sswitch_7
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Lb7/d1;

    .line 104
    .line 105
    check-cast p1, Lm4/w0;

    .line 106
    .line 107
    iget-object v0, v0, Lb7/d1;->o:Lb7/b1;

    .line 108
    .line 109
    iget-object v0, v0, Lb7/b1;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, Lb7/v3;

    .line 112
    .line 113
    iget-object v0, v0, Lb7/v3;->z:Lm4/l0;

    .line 114
    .line 115
    invoke-interface {p1, v0}, Lm4/w0;->h(Lm4/l0;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_7
        0x13 -> :sswitch_6
        0x14 -> :sswitch_5
        0x15 -> :sswitch_4
        0x16 -> :sswitch_3
        0x17 -> :sswitch_2
        0x19 -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/offline/g;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lya/f0;

    .line 9
    .line 10
    check-cast p1, Lo6/a;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :sswitch_0
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lo6/h;

    .line 19
    .line 20
    check-cast p1, Lo6/a;

    .line 21
    .line 22
    new-instance v1, Lo6/g;

    .line 23
    .line 24
    iget-wide v2, p1, Lo6/a;->b:J

    .line 25
    .line 26
    iget-object v4, p1, Lo6/a;->a:Lya/i0;

    .line 27
    .line 28
    iget-wide v5, p1, Lo6/a;->c:J

    .line 29
    .line 30
    invoke-static {v4, v5, v6}, Lm3/l;->r(Lya/i0;J)[B

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-direct {v1, v4, v2, v3}, Lo6/g;-><init>([BJ)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v0, Lo6/h;->c:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    iget-wide v2, v0, Lo6/h;->j:J

    .line 43
    .line 44
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    cmp-long v6, v2, v4

    .line 50
    .line 51
    if-eqz v6, :cond_0

    .line 52
    .line 53
    iget-wide v4, p1, Lo6/a;->b:J

    .line 54
    .line 55
    cmp-long p1, v4, v2

    .line 56
    .line 57
    if-ltz p1, :cond_1

    .line 58
    .line 59
    :cond_0
    invoke-virtual {v0, v1}, Lo6/h;->b(Lo6/g;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void

    .line 63
    :sswitch_1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Landroid/view/Surface;

    .line 66
    .line 67
    check-cast p1, Lb7/z3;

    .line 68
    .line 69
    invoke-virtual {p1}, Lb7/z3;->r0()V

    .line 70
    .line 71
    .line 72
    iget-object p1, p1, Lb7/z3;->a:Landroidx/media3/exoplayer/ExoPlayer;

    .line 73
    .line 74
    check-cast p1, Lv4/v;

    .line 75
    .line 76
    invoke-virtual {p1}, Lv4/v;->m2()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lv4/v;->Y1()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v0}, Lv4/v;->f2(Landroid/view/Surface;)V

    .line 83
    .line 84
    .line 85
    if-nez v0, :cond_2

    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    goto :goto_0

    .line 89
    :cond_2
    const/4 v0, -0x1

    .line 90
    :goto_0
    invoke-virtual {p1, v0, v0}, Lv4/v;->S1(II)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :sswitch_2
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lm4/s0;

    .line 97
    .line 98
    check-cast p1, Lb7/z3;

    .line 99
    .line 100
    invoke-virtual {p1}, Lb7/z3;->r0()V

    .line 101
    .line 102
    .line 103
    iget-object p1, p1, Lb7/z3;->a:Landroidx/media3/exoplayer/ExoPlayer;

    .line 104
    .line 105
    check-cast p1, Lv4/v;

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Lv4/v;->d2(Lm4/s0;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_2
        0x8 -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public b(Lb7/z3;Lb7/t1;)V
    .locals 0

    .line 1
    iget-object p2, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Lp4/g;

    .line 4
    .line 5
    invoke-interface {p2, p1}, Lp4/g;->accept(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public c(Lb7/t0;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Landroidx/media3/exoplayer/offline/g;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lb7/k;

    .line 13
    .line 14
    iget-object v3, v1, Lb7/t0;->e:Lb7/k4;

    .line 15
    .line 16
    iget-object v4, v1, Lb7/t0;->a:Lb7/d0;

    .line 17
    .line 18
    iget-object v5, v1, Lb7/t0;->w:Lb7/t;

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    const-string v1, "MCImplBase"

    .line 23
    .line 24
    const-string v2, "Cannot be notified about the connection result many times. Probably a bug or malicious app."

    .line 25
    .line 26
    invoke-static {v1, v2}, Lp4/c;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4}, Lb7/d0;->d()V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_1

    .line 33
    .line 34
    :cond_0
    iget-object v5, v2, Lb7/k;->c:Lb7/t;

    .line 35
    .line 36
    iget-object v6, v2, Lb7/k;->n:Lya/i0;

    .line 37
    .line 38
    iget-object v7, v2, Lb7/k;->i:Landroid/os/Bundle;

    .line 39
    .line 40
    iput-object v5, v1, Lb7/t0;->w:Lb7/t;

    .line 41
    .line 42
    iget-object v5, v2, Lb7/k;->e:Lb7/f4;

    .line 43
    .line 44
    iput-object v5, v1, Lb7/t0;->s:Lb7/f4;

    .line 45
    .line 46
    iget-object v5, v2, Lb7/k;->f:Lm4/u0;

    .line 47
    .line 48
    iput-object v5, v1, Lb7/t0;->t:Lm4/u0;

    .line 49
    .line 50
    iget-object v8, v2, Lb7/k;->g:Lm4/u0;

    .line 51
    .line 52
    iput-object v8, v1, Lb7/t0;->u:Lm4/u0;

    .line 53
    .line 54
    invoke-static {v5, v8}, Lb7/t0;->b(Lm4/u0;Lm4/u0;)Lm4/u0;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    iput-object v5, v1, Lb7/t0;->v:Lm4/u0;

    .line 59
    .line 60
    iget-object v8, v2, Lb7/k;->k:Lya/i0;

    .line 61
    .line 62
    iput-object v8, v1, Lb7/t0;->o:Lya/i0;

    .line 63
    .line 64
    iget-object v9, v2, Lb7/k;->l:Lya/i0;

    .line 65
    .line 66
    iput-object v9, v1, Lb7/t0;->p:Lya/i0;

    .line 67
    .line 68
    iget-object v10, v1, Lb7/t0;->s:Lb7/f4;

    .line 69
    .line 70
    invoke-static {v9, v8, v10, v5, v7}, Lb7/t0;->n(Ljava/util/List;Ljava/util/List;Lb7/f4;Lm4/u0;Landroid/os/Bundle;)Lya/a1;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    iput-object v5, v1, Lb7/t0;->q:Lya/a1;

    .line 75
    .line 76
    iget-object v8, v1, Lb7/t0;->o:Lya/i0;

    .line 77
    .line 78
    iget-object v9, v1, Lb7/t0;->s:Lb7/f4;

    .line 79
    .line 80
    iget-object v10, v1, Lb7/t0;->v:Lm4/u0;

    .line 81
    .line 82
    invoke-static {v5, v8, v7, v9, v10}, Lb7/t0;->m(Lya/a1;Ljava/util/List;Landroid/os/Bundle;Lb7/f4;Lm4/u0;)Lya/a1;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    iput-object v5, v1, Lb7/t0;->r:Lya/a1;

    .line 87
    .line 88
    new-instance v5, Lah/j;

    .line 89
    .line 90
    const/4 v8, 0x4

    .line 91
    invoke-direct {v5, v8}, Lah/j;-><init>(I)V

    .line 92
    .line 93
    .line 94
    const/4 v8, 0x0

    .line 95
    const/4 v9, 0x0

    .line 96
    :goto_0
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->size()I

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    if-ge v9, v10, :cond_2

    .line 101
    .line 102
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    check-cast v10, Lb7/b;

    .line 107
    .line 108
    iget-object v11, v10, Lb7/b;->a:Lb7/e4;

    .line 109
    .line 110
    if-eqz v11, :cond_1

    .line 111
    .line 112
    iget v12, v11, Lb7/e4;->a:I

    .line 113
    .line 114
    if-nez v12, :cond_1

    .line 115
    .line 116
    iget-object v11, v11, Lb7/e4;->b:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v5, v11, v10}, Lah/j;->G(Ljava/lang/Object;Ljava/lang/Object;)Lah/j;

    .line 119
    .line 120
    .line 121
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_2
    invoke-virtual {v5}, Lah/j;->c()Lya/k0;

    .line 125
    .line 126
    .line 127
    iget-object v5, v2, Lb7/k;->j:Lb7/v3;

    .line 128
    .line 129
    iput-object v5, v1, Lb7/t0;->n:Lb7/v3;

    .line 130
    .line 131
    iget-object v5, v2, Lb7/k;->m:Landroid/media/session/MediaSession$Token;

    .line 132
    .line 133
    if-nez v5, :cond_3

    .line 134
    .line 135
    iget-object v5, v3, Lb7/k4;->a:Lb7/j4;

    .line 136
    .line 137
    invoke-interface {v5}, Lb7/j4;->l()Landroid/media/session/MediaSession$Token;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    :cond_3
    if-eqz v5, :cond_4

    .line 142
    .line 143
    new-instance v6, Landroid/media/session/MediaController;

    .line 144
    .line 145
    iget-object v9, v1, Lb7/t0;->d:Landroid/content/Context;

    .line 146
    .line 147
    invoke-direct {v6, v9, v5}, Landroid/media/session/MediaController;-><init>(Landroid/content/Context;Landroid/media/session/MediaSession$Token;)V

    .line 148
    .line 149
    .line 150
    iput-object v6, v1, Lb7/t0;->x:Landroid/media/session/MediaController;

    .line 151
    .line 152
    :cond_4
    :try_start_0
    iget-object v6, v2, Lb7/k;->c:Lb7/t;

    .line 153
    .line 154
    invoke-interface {v6}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    iget-object v9, v1, Lb7/t0;->g:Lb7/k0;

    .line 159
    .line 160
    invoke-interface {v6, v9, v8}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .line 162
    .line 163
    new-instance v9, Lb7/k4;

    .line 164
    .line 165
    iget-object v6, v3, Lb7/k4;->a:Lb7/j4;

    .line 166
    .line 167
    invoke-interface {v6}, Lb7/j4;->a()I

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    iget v11, v2, Lb7/k;->a:I

    .line 172
    .line 173
    iget v12, v2, Lb7/k;->b:I

    .line 174
    .line 175
    iget-object v3, v3, Lb7/k4;->a:Lb7/j4;

    .line 176
    .line 177
    invoke-interface {v3}, Lb7/j4;->e()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v13

    .line 181
    iget-object v14, v2, Lb7/k;->c:Lb7/t;

    .line 182
    .line 183
    iget-object v15, v2, Lb7/k;->h:Landroid/os/Bundle;

    .line 184
    .line 185
    move-object/from16 v16, v5

    .line 186
    .line 187
    invoke-direct/range {v9 .. v16}, Lb7/k4;-><init>(IIILjava/lang/String;Lb7/t;Landroid/os/Bundle;Landroid/media/session/MediaSession$Token;)V

    .line 188
    .line 189
    .line 190
    iput-object v9, v1, Lb7/t0;->k:Lb7/k4;

    .line 191
    .line 192
    iput-object v7, v1, Lb7/t0;->C:Landroid/os/Bundle;

    .line 193
    .line 194
    invoke-virtual {v4}, Lb7/d0;->a()V

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :catch_0
    invoke-virtual {v4}, Lb7/d0;->d()V

    .line 199
    .line 200
    .line 201
    :goto_1
    return-void

    .line 202
    :pswitch_0
    iget-object v2, v1, Lb7/t0;->a:Lb7/d0;

    .line 203
    .line 204
    iget-object v3, v0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v3, Landroid/os/Bundle;

    .line 207
    .line 208
    invoke-virtual {v1}, Lb7/t0;->T()Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-nez v4, :cond_5

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_5
    iget-object v4, v1, Lb7/t0;->q:Lya/a1;

    .line 216
    .line 217
    iget-object v5, v1, Lb7/t0;->r:Lya/a1;

    .line 218
    .line 219
    iput-object v3, v1, Lb7/t0;->C:Landroid/os/Bundle;

    .line 220
    .line 221
    iget-object v6, v1, Lb7/t0;->p:Lya/i0;

    .line 222
    .line 223
    iget-object v7, v1, Lb7/t0;->o:Lya/i0;

    .line 224
    .line 225
    iget-object v8, v1, Lb7/t0;->s:Lb7/f4;

    .line 226
    .line 227
    iget-object v9, v1, Lb7/t0;->v:Lm4/u0;

    .line 228
    .line 229
    invoke-static {v6, v7, v8, v9, v3}, Lb7/t0;->n(Ljava/util/List;Ljava/util/List;Lb7/f4;Lm4/u0;Landroid/os/Bundle;)Lya/a1;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    iput-object v3, v1, Lb7/t0;->q:Lya/a1;

    .line 234
    .line 235
    iget-object v6, v1, Lb7/t0;->o:Lya/i0;

    .line 236
    .line 237
    iget-object v7, v1, Lb7/t0;->C:Landroid/os/Bundle;

    .line 238
    .line 239
    iget-object v8, v1, Lb7/t0;->s:Lb7/f4;

    .line 240
    .line 241
    iget-object v9, v1, Lb7/t0;->v:Lm4/u0;

    .line 242
    .line 243
    invoke-static {v3, v6, v7, v8, v9}, Lb7/t0;->m(Lya/a1;Ljava/util/List;Landroid/os/Bundle;Lb7/f4;Lm4/u0;)Lya/a1;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    iput-object v3, v1, Lb7/t0;->r:Lya/a1;

    .line 248
    .line 249
    iget-object v3, v1, Lb7/t0;->q:Lya/a1;

    .line 250
    .line 251
    invoke-virtual {v3, v4}, Lya/i0;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    iget-object v1, v1, Lb7/t0;->r:Lya/a1;

    .line 256
    .line 257
    invoke-virtual {v1, v5}, Lya/i0;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    iget-object v4, v2, Lb7/d0;->d:Landroid/os/Handler;

    .line 268
    .line 269
    invoke-virtual {v4}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    if-ne v1, v4, :cond_6

    .line 274
    .line 275
    const/4 v1, 0x1

    .line 276
    goto :goto_2

    .line 277
    :cond_6
    const/4 v1, 0x0

    .line 278
    :goto_2
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 279
    .line 280
    .line 281
    iget-object v1, v2, Lb7/d0;->c:Lb7/b0;

    .line 282
    .line 283
    invoke-interface {v1}, Lb7/b0;->q()V

    .line 284
    .line 285
    .line 286
    if-nez v3, :cond_7

    .line 287
    .line 288
    invoke-interface {v1}, Lb7/b0;->w()V

    .line 289
    .line 290
    .line 291
    :cond_7
    :goto_3
    return-void

    .line 292
    :pswitch_1
    iget-object v2, v0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v2, Lb7/h4;

    .line 295
    .line 296
    invoke-virtual {v1}, Lb7/t0;->T()Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-nez v3, :cond_8

    .line 301
    .line 302
    goto :goto_4

    .line 303
    :cond_8
    iget-object v3, v1, Lb7/t0;->j:Lo/f;

    .line 304
    .line 305
    invoke-virtual {v3}, Lo/f;->isEmpty()Z

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    if-eqz v3, :cond_a

    .line 310
    .line 311
    iget-object v3, v1, Lb7/t0;->n:Lb7/v3;

    .line 312
    .line 313
    iget-object v3, v3, Lb7/v3;->c:Lb7/h4;

    .line 314
    .line 315
    iget-wide v4, v3, Lb7/h4;->c:J

    .line 316
    .line 317
    iget-wide v6, v2, Lb7/h4;->c:J

    .line 318
    .line 319
    cmp-long v8, v4, v6

    .line 320
    .line 321
    if-gez v8, :cond_a

    .line 322
    .line 323
    invoke-static {v2, v3}, Lb7/s3;->d(Lb7/h4;Lb7/h4;)Z

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    if-nez v3, :cond_9

    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_9
    iget-object v3, v1, Lb7/t0;->n:Lb7/v3;

    .line 331
    .line 332
    invoke-virtual {v3, v2}, Lb7/v3;->e(Lb7/h4;)Lb7/v3;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    iput-object v2, v1, Lb7/t0;->n:Lb7/v3;

    .line 337
    .line 338
    :cond_a
    :goto_4
    return-void

    .line 339
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method

.method public d(Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm4/q;

    .line 4
    .line 5
    check-cast p1, Lg5/n;

    .line 6
    .line 7
    iget-object v1, p1, Lg5/n;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, v0, Lm4/q;->n:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    invoke-static {v0}, Lg5/y;->b(Lm4/q;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return v3

    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p1, v0, v3}, Lg5/n;->c(Lm4/q;Z)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    :cond_2
    return v3
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
.end method

.method public e(ILm4/j1;[I)Lya/a1;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v5, v0

    .line 4
    check-cast v5, Lm5/j;

    .line 5
    .line 6
    invoke-static {}, Lya/i0;->p()Lya/f0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    :goto_0
    iget v1, p2, Lm4/j1;->a:I

    .line 13
    .line 14
    if-ge v4, v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Lm5/g;

    .line 17
    .line 18
    aget v6, p3, v4

    .line 19
    .line 20
    move v2, p1

    .line 21
    move-object v3, p2

    .line 22
    invoke-direct/range {v1 .. v6}, Lm5/g;-><init>(ILm4/j1;ILm5/j;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v0}, Lya/f0;->f()Lya/a1;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
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

.method public f(J)J
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr5/t;

    .line 4
    .line 5
    iget v1, v0, Lr5/t;->e:I

    .line 6
    .line 7
    int-to-long v1, v1

    .line 8
    mul-long p1, p1, v1

    .line 9
    .line 10
    const-wide/32 v1, 0xf4240

    .line 11
    .line 12
    .line 13
    div-long v3, p1, v1

    .line 14
    .line 15
    iget-wide p1, v0, Lr5/t;->j:J

    .line 16
    .line 17
    const-wide/16 v0, 0x1

    .line 18
    .line 19
    sub-long v7, p1, v0

    .line 20
    .line 21
    const-wide/16 v5, 0x0

    .line 22
    .line 23
    invoke-static/range {v3 .. v8}, Lp4/c0;->j(JJJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    return-wide p1
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

.method public g(JJJ)V
    .locals 6

    .line 1
    iget-object p5, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p5, Landroidx/media3/exoplayer/offline/w;

    .line 4
    .line 5
    iget-object v0, p5, Landroidx/media3/exoplayer/offline/w;->e:Landroidx/media3/exoplayer/offline/l;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-wide/16 p5, -0x1

    .line 11
    .line 12
    cmp-long v1, p1, p5

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    const-wide/16 p5, 0x0

    .line 17
    .line 18
    cmp-long v1, p1, p5

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    long-to-float p5, p3

    .line 24
    const/high16 p6, 0x42c80000    # 100.0f

    .line 25
    .line 26
    mul-float p5, p5, p6

    .line 27
    .line 28
    long-to-float p6, p1

    .line 29
    div-float/2addr p5, p6

    .line 30
    move v5, p5

    .line 31
    :goto_0
    move-wide v1, p1

    .line 32
    move-wide v3, p3

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    :goto_1
    const/high16 p5, -0x40800000    # -1.0f

    .line 35
    .line 36
    const/high16 v5, -0x40800000    # -1.0f

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :goto_2
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/exoplayer/offline/l;->b(JJF)V

    .line 40
    .line 41
    .line 42
    return-void
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

.method public h(Lb7/c2;Lb7/t1;I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/offline/g;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lb7/n3;

    .line 9
    .line 10
    sget-object v0, Lcb/v;->b:Lcb/v;

    .line 11
    .line 12
    invoke-virtual {p1}, Lb7/c2;->h()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p1, p1, Lb7/c2;->t:Lb7/z3;

    .line 20
    .line 21
    invoke-interface {v1, p1, p2}, Lb7/n3;->b(Lb7/z3;Lb7/t1;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Lb7/i4;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-direct {p1, v0}, Lb7/i4;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-static {p2, p3, p1}, Lb7/q3;->H0(Lb7/t1;ILb7/i4;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    sget-object p1, Lcb/v;->b:Lcb/v;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_0
    check-cast v1, Lya/i0;

    .line 37
    .line 38
    invoke-virtual {p1, p2, v1}, Lb7/c2;->j(Lb7/t1;Ljava/util/List;)Lcb/y;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
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

.method public i()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lic/n;

    .line 4
    .line 5
    sget-object v1, Lh1/n;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    sget-object v2, Lh1/n;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ljava/lang/Iterable;

    .line 11
    .line 12
    invoke-static {v2, v0}, Lvb/m;->n0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lh1/n;->h:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    monitor-exit v1

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    monitor-exit v1

    .line 22
    throw v0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
