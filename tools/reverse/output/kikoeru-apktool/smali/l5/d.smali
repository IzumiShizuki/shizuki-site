.class public final Ll5/d;
.super Lv4/e;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public A:Lo6/c;

.field public B:I

.field public final C:Landroid/os/Handler;

.field public final D:Lv4/s;

.field public final E:Lv2/e;

.field public F:Z

.field public G:Z

.field public H:Lm4/q;

.field public I:J

.field public J:J

.field public K:Ljava/io/IOException;

.field public final r:Lm3/l;

.field public final s:Lu4/f;

.field public t:Ll5/a;

.field public final u:Ll5/c;

.field public v:Z

.field public w:I

.field public x:Lo6/e;

.field public y:Lo6/i;

.field public z:Lo6/c;


# direct methods
.method public constructor <init>(Lv4/s;Landroid/os/Looper;)V
    .locals 2

    .line 1
    sget-object v0, Ll5/c;->j0:Li7/p2;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {p0, v1}, Lv4/e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ll5/d;->D:Lv4/s;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget p1, Lp4/c0;->a:I

    .line 14
    .line 15
    new-instance p1, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iput-object p1, p0, Ll5/d;->C:Landroid/os/Handler;

    .line 21
    .line 22
    iput-object v0, p0, Ll5/d;->u:Ll5/c;

    .line 23
    .line 24
    new-instance p1, Lm3/l;

    .line 25
    .line 26
    const/16 p2, 0xf

    .line 27
    .line 28
    invoke-direct {p1, p2}, Lm3/l;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Ll5/d;->r:Lm3/l;

    .line 32
    .line 33
    new-instance p1, Lu4/f;

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    invoke-direct {p1, p2}, Lu4/f;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Ll5/d;->s:Lu4/f;

    .line 40
    .line 41
    new-instance p1, Lv2/e;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-direct {p1, p2, v0}, Lv2/e;-><init>(IZ)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Ll5/d;->E:Lv2/e;

    .line 48
    .line 49
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    iput-wide p1, p0, Ll5/d;->J:J

    .line 55
    .line 56
    iput-wide p1, p0, Ll5/d;->I:J

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 3

    .line 1
    iget-object v0, p0, Ll5/d;->H:Lm4/q;

    .line 2
    .line 3
    iget-object v0, v0, Lm4/q;->n:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "application/cea-608"

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Ll5/d;->H:Lm4/q;

    .line 14
    .line 15
    iget-object v0, v0, Lm4/q;->n:Ljava/lang/String;

    .line 16
    .line 17
    const-string v1, "application/x-mp4-cea-608"

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Ll5/d;->H:Lm4/q;

    .line 26
    .line 27
    iget-object v0, v0, Lm4/q;->n:Ljava/lang/String;

    .line 28
    .line 29
    const-string v1, "application/cea-708"

    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v0, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 41
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v2, "Legacy decoding is disabled, can\'t handle "

    .line 44
    .line 45
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Ll5/d;->H:Lm4/q;

    .line 49
    .line 50
    iget-object v2, v2, Lm4/q;->n:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v2, " samples (expected application/x-media3-cues)."

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1, v0}, Lp4/c;->h(Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    return-void
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

.method public final B()J
    .locals 4

    .line 1
    iget v0, p0, Ll5/d;->B:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-wide v2, 0x7fffffffffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return-wide v2

    .line 12
    :cond_0
    iget-object v0, p0, Ll5/d;->z:Lo6/c;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v0, p0, Ll5/d;->B:I

    .line 18
    .line 19
    iget-object v1, p0, Ll5/d;->z:Lo6/c;

    .line 20
    .line 21
    invoke-virtual {v1}, Lo6/c;->g()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lt v0, v1, :cond_1

    .line 26
    .line 27
    return-wide v2

    .line 28
    :cond_1
    iget-object v0, p0, Ll5/d;->z:Lo6/c;

    .line 29
    .line 30
    iget v1, p0, Ll5/d;->B:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lo6/c;->e(I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    return-wide v0
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
.end method

.method public final C(J)J
    .locals 3

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 14
    .line 15
    .line 16
    iget-wide v0, p0, Lv4/e;->k:J

    .line 17
    .line 18
    sub-long/2addr p1, v0

    .line 19
    return-wide p1
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

.method public final D()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ll5/d;->v:Z

    .line 3
    .line 4
    iget-object v1, p0, Ll5/d;->H:Lm4/q;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Ll5/d;->u:Ll5/c;

    .line 10
    .line 11
    check-cast v2, Li7/p2;

    .line 12
    .line 13
    iget-object v2, v2, Li7/p2;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lm3/l;

    .line 16
    .line 17
    iget-object v3, v1, Lm4/q;->n:Ljava/lang/String;

    .line 18
    .line 19
    iget v4, v1, Lm4/q;->I:I

    .line 20
    .line 21
    if-eqz v3, :cond_3

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    const/4 v6, -0x1

    .line 28
    sparse-switch v5, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    :goto_0
    const/4 v0, -0x1

    .line 32
    goto :goto_1

    .line 33
    :sswitch_0
    const-string v0, "application/cea-708"

    .line 34
    .line 35
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v0, 0x2

    .line 43
    goto :goto_1

    .line 44
    :sswitch_1
    const-string v5, "application/cea-608"

    .line 45
    .line 46
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-nez v5, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :sswitch_2
    const-string v0, "application/x-mp4-cea-608"

    .line 54
    .line 55
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v0, 0x0

    .line 63
    :cond_2
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :pswitch_0
    new-instance v0, Lp6/f;

    .line 68
    .line 69
    iget-object v1, v1, Lm4/q;->q:Ljava/util/List;

    .line 70
    .line 71
    invoke-direct {v0, v4, v1}, Lp6/f;-><init>(ILjava/util/List;)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :pswitch_1
    new-instance v0, Lp6/c;

    .line 76
    .line 77
    invoke-direct {v0, v4, v3}, Lp6/c;-><init>(ILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    :goto_2
    invoke-virtual {v2, v1}, Lm3/l;->k(Lm4/q;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    invoke-virtual {v2, v1}, Lm3/l;->h(Lm4/q;)Lo6/l;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v1, Lf5/b;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    const-string v3, "Decoder"

    .line 102
    .line 103
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    invoke-direct {v1, v0}, Lf5/b;-><init>(Lo6/l;)V

    .line 107
    .line 108
    .line 109
    move-object v0, v1

    .line 110
    :goto_3
    iput-object v0, p0, Ll5/d;->x:Lo6/e;

    .line 111
    .line 112
    iget-wide v1, p0, Lv4/e;->l:J

    .line 113
    .line 114
    invoke-interface {v0, v1, v2}, Lu4/c;->c(J)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 119
    .line 120
    const-string v1, "Attempted to create decoder for unsupported MIME type: "

    .line 121
    .line 122
    invoke-static {v1, v3}, Lj2/h0;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v0

    .line 130
    nop

    .line 131
    :sswitch_data_0
    .sparse-switch
        0x37713300 -> :sswitch_2
        0x5d578071 -> :sswitch_1
        0x5d578432 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public final E(Lo4/c;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lo4/c;->a:Lya/i0;

    .line 2
    .line 3
    iget-object v1, p0, Ll5/d;->D:Lv4/s;

    .line 4
    .line 5
    iget-object v2, v1, Lv4/s;->a:Lv4/v;

    .line 6
    .line 7
    iget-object v2, v2, Lv4/v;->m:Lp4/n;

    .line 8
    .line 9
    new-instance v3, Lb7/z2;

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    invoke-direct {v3, v4, v0}, Lb7/z2;-><init>(ILjava/util/List;)V

    .line 13
    .line 14
    .line 15
    const/16 v0, 0x1b

    .line 16
    .line 17
    invoke-virtual {v2, v0, v3}, Lp4/n;->e(ILp4/k;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v1, Lv4/s;->a:Lv4/v;

    .line 21
    .line 22
    iput-object p1, v1, Lv4/v;->W:Lo4/c;

    .line 23
    .line 24
    iget-object v1, v1, Lv4/v;->m:Lp4/n;

    .line 25
    .line 26
    new-instance v2, Landroidx/media3/exoplayer/offline/g;

    .line 27
    .line 28
    const/16 v3, 0x15

    .line 29
    .line 30
    invoke-direct {v2, v3, p1}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0, v2}, Lp4/n;->e(ILp4/k;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final F()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ll5/d;->y:Lo6/i;

    .line 3
    .line 4
    const/4 v1, -0x1

    .line 5
    iput v1, p0, Ll5/d;->B:I

    .line 6
    .line 7
    iget-object v1, p0, Ll5/d;->z:Lo6/c;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lu4/g;->i()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ll5/d;->z:Lo6/c;

    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, Ll5/d;->A:Lo6/c;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Lu4/g;->i()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Ll5/d;->A:Lo6/c;

    .line 24
    .line 25
    :cond_1
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lo4/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Ll5/d;->E(Lo4/c;)V

    .line 11
    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p1
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

.method public final i()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "TextRenderer"

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll5/d;->G:Z

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final l()Z
    .locals 7

    .line 1
    iget-object v0, p0, Ll5/d;->H:Lm4/q;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    iget-object v0, p0, Ll5/d;->K:Ljava/io/IOException;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :try_start_0
    iget-object v0, p0, Lv4/e;->i:Lj5/c1;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Lj5/c1;->b()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    iput-object v0, p0, Ll5/d;->K:Ljava/io/IOException;

    .line 22
    .line 23
    :cond_1
    :goto_0
    iget-object v0, p0, Ll5/d;->K:Ljava/io/IOException;

    .line 24
    .line 25
    if-eqz v0, :cond_7

    .line 26
    .line 27
    iget-object v0, p0, Ll5/d;->H:Lm4/q;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, Lm4/q;->n:Ljava/lang/String;

    .line 33
    .line 34
    const-string v2, "application/x-media3-cues"

    .line 35
    .line 36
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v2, 0x0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    iget-object v0, p0, Ll5/d;->t:Ll5/a;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-wide v3, p0, Ll5/d;->I:J

    .line 49
    .line 50
    invoke-interface {v0, v3, v4}, Ll5/a;->a(J)J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    const-wide/high16 v5, -0x8000000000000000L

    .line 55
    .line 56
    cmp-long v0, v3, v5

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const/4 v1, 0x0

    .line 62
    :goto_1
    return v1

    .line 63
    :cond_3
    iget-boolean v0, p0, Ll5/d;->G:Z

    .line 64
    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    iget-boolean v0, p0, Ll5/d;->F:Z

    .line 68
    .line 69
    if-eqz v0, :cond_7

    .line 70
    .line 71
    iget-object v0, p0, Ll5/d;->z:Lo6/c;

    .line 72
    .line 73
    iget-wide v3, p0, Ll5/d;->I:J

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    invoke-virtual {v0}, Lo6/c;->g()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    sub-int/2addr v5, v1

    .line 82
    invoke-virtual {v0, v5}, Lo6/c;->e(I)J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    cmp-long v0, v5, v3

    .line 87
    .line 88
    if-gtz v0, :cond_7

    .line 89
    .line 90
    :cond_4
    iget-object v0, p0, Ll5/d;->A:Lo6/c;

    .line 91
    .line 92
    iget-wide v3, p0, Ll5/d;->I:J

    .line 93
    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    invoke-virtual {v0}, Lo6/c;->g()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    sub-int/2addr v5, v1

    .line 101
    invoke-virtual {v0, v5}, Lo6/c;->e(I)J

    .line 102
    .line 103
    .line 104
    move-result-wide v5

    .line 105
    cmp-long v0, v5, v3

    .line 106
    .line 107
    if-gtz v0, :cond_7

    .line 108
    .line 109
    :cond_5
    iget-object v0, p0, Ll5/d;->y:Lo6/i;

    .line 110
    .line 111
    if-eqz v0, :cond_7

    .line 112
    .line 113
    :cond_6
    return v2

    .line 114
    :cond_7
    :goto_2
    return v1
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public final m()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ll5/d;->H:Lm4/q;

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, Ll5/d;->J:J

    .line 10
    .line 11
    new-instance v3, Lo4/c;

    .line 12
    .line 13
    sget-object v4, Lya/a1;->e:Lya/a1;

    .line 14
    .line 15
    iget-wide v5, p0, Ll5/d;->I:J

    .line 16
    .line 17
    invoke-virtual {p0, v5, v6}, Ll5/d;->C(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    invoke-direct {v3, v5, v6, v4}, Lo4/c;-><init>(JLjava/util/List;)V

    .line 22
    .line 23
    .line 24
    iget-object v4, p0, Ll5/d;->C:Landroid/os/Handler;

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    invoke-virtual {v4, v5, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p0, v3}, Ll5/d;->E(Lo4/c;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iput-wide v1, p0, Ll5/d;->I:J

    .line 41
    .line 42
    iget-object v1, p0, Ll5/d;->x:Lo6/e;

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Ll5/d;->F()V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Ll5/d;->x:Lo6/e;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-interface {v1}, Lu4/c;->a()V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Ll5/d;->x:Lo6/e;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    iput v0, p0, Ll5/d;->w:I

    .line 61
    .line 62
    :cond_1
    return-void
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

.method public final o(JZ)V
    .locals 2

    .line 1
    iput-wide p1, p0, Ll5/d;->I:J

    .line 2
    .line 3
    iget-object p1, p0, Ll5/d;->t:Ll5/a;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Ll5/a;->clear()V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance p1, Lo4/c;

    .line 11
    .line 12
    sget-object p2, Lya/a1;->e:Lya/a1;

    .line 13
    .line 14
    iget-wide v0, p0, Ll5/d;->I:J

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Ll5/d;->C(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-direct {p1, v0, v1, p2}, Lo4/c;-><init>(JLjava/util/List;)V

    .line 21
    .line 22
    .line 23
    iget-object p2, p0, Ll5/d;->C:Landroid/os/Handler;

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    const/4 p3, 0x1

    .line 28
    invoke-virtual {p2, p3, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, p1}, Ll5/d;->E(Lo4/c;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    const/4 p1, 0x0

    .line 40
    iput-boolean p1, p0, Ll5/d;->F:Z

    .line 41
    .line 42
    iput-boolean p1, p0, Ll5/d;->G:Z

    .line 43
    .line 44
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    iput-wide p2, p0, Ll5/d;->J:J

    .line 50
    .line 51
    iget-object p2, p0, Ll5/d;->H:Lm4/q;

    .line 52
    .line 53
    if-eqz p2, :cond_3

    .line 54
    .line 55
    iget-object p2, p2, Lm4/q;->n:Ljava/lang/String;

    .line 56
    .line 57
    const-string p3, "application/x-media3-cues"

    .line 58
    .line 59
    invoke-static {p2, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-nez p2, :cond_3

    .line 64
    .line 65
    iget p2, p0, Ll5/d;->w:I

    .line 66
    .line 67
    if-eqz p2, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0}, Ll5/d;->F()V

    .line 70
    .line 71
    .line 72
    iget-object p2, p0, Ll5/d;->x:Lo6/e;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-interface {p2}, Lu4/c;->a()V

    .line 78
    .line 79
    .line 80
    const/4 p2, 0x0

    .line 81
    iput-object p2, p0, Ll5/d;->x:Lo6/e;

    .line 82
    .line 83
    iput p1, p0, Ll5/d;->w:I

    .line 84
    .line 85
    invoke-virtual {p0}, Ll5/d;->D()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_2
    invoke-virtual {p0}, Ll5/d;->F()V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Ll5/d;->x:Lo6/e;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-interface {p1}, Lu4/c;->flush()V

    .line 98
    .line 99
    .line 100
    iget-wide p2, p0, Lv4/e;->l:J

    .line 101
    .line 102
    invoke-interface {p1, p2, p3}, Lu4/c;->c(J)V

    .line 103
    .line 104
    .line 105
    :cond_3
    return-void
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

.method public final t([Lm4/q;JJLj5/d0;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    aget-object p1, p1, p2

    .line 3
    .line 4
    iput-object p1, p0, Ll5/d;->H:Lm4/q;

    .line 5
    .line 6
    iget-object p1, p1, Lm4/q;->n:Ljava/lang/String;

    .line 7
    .line 8
    const-string p2, "application/x-media3-cues"

    .line 9
    .line 10
    invoke-static {p1, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 p2, 0x1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Ll5/d;->A()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Ll5/d;->x:Lo6/e;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iput p2, p0, Ll5/d;->w:I

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {p0}, Ll5/d;->D()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object p1, p0, Ll5/d;->H:Lm4/q;

    .line 32
    .line 33
    iget p1, p1, Lm4/q;->J:I

    .line 34
    .line 35
    if-ne p1, p2, :cond_2

    .line 36
    .line 37
    new-instance p1, Ll5/b;

    .line 38
    .line 39
    invoke-direct {p1}, Ll5/b;-><init>()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    new-instance p1, Lhd/q0;

    .line 44
    .line 45
    const/4 p2, 0x2

    .line 46
    const/4 p3, 0x0

    .line 47
    invoke-direct {p1, p3, p2}, Lhd/q0;-><init>(BI)V

    .line 48
    .line 49
    .line 50
    :goto_0
    iput-object p1, p0, Ll5/d;->t:Ll5/a;

    .line 51
    .line 52
    return-void
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
.end method

.method public final v(JJ)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    iget-boolean v0, v1, Lv4/e;->n:Z

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-wide v5, v1, Ll5/d;->J:J

    .line 11
    .line 12
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    cmp-long v0, v5, v7

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    cmp-long v0, v2, v5

    .line 22
    .line 23
    if-ltz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Ll5/d;->F()V

    .line 26
    .line 27
    .line 28
    iput-boolean v4, v1, Ll5/d;->G:Z

    .line 29
    .line 30
    :cond_0
    iget-boolean v0, v1, Ll5/d;->G:Z

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto/16 :goto_10

    .line 35
    .line 36
    :cond_1
    iget-object v0, v1, Ll5/d;->H:Lm4/q;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v0, v0, Lm4/q;->n:Ljava/lang/String;

    .line 42
    .line 43
    const-string v5, "application/x-media3-cues"

    .line 44
    .line 45
    invoke-static {v0, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-object v5, v1, Ll5/d;->C:Landroid/os/Handler;

    .line 50
    .line 51
    const/4 v6, 0x4

    .line 52
    const/4 v7, -0x4

    .line 53
    iget-object v8, v1, Ll5/d;->E:Lv2/e;

    .line 54
    .line 55
    const/4 v9, 0x0

    .line 56
    if-eqz v0, :cond_a

    .line 57
    .line 58
    iget-object v0, v1, Ll5/d;->t:Ll5/a;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-boolean v0, v1, Ll5/d;->F:Z

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    goto/16 :goto_1

    .line 68
    .line 69
    :cond_2
    iget-object v0, v1, Ll5/d;->s:Lu4/f;

    .line 70
    .line 71
    invoke-virtual {v1, v8, v0, v9}, Lv4/e;->u(Lv2/e;Lu4/f;I)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    if-eq v8, v7, :cond_3

    .line 76
    .line 77
    goto/16 :goto_1

    .line 78
    .line 79
    :cond_3
    invoke-virtual {v0, v6}, Lq4/d;->d(I)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_4

    .line 84
    .line 85
    iput-boolean v4, v1, Ll5/d;->F:Z

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    invoke-virtual {v0}, Lu4/f;->k()V

    .line 89
    .line 90
    .line 91
    iget-object v6, v0, Lu4/f;->e:Ljava/nio/ByteBuffer;

    .line 92
    .line 93
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-wide v11, v0, Lu4/f;->g:J

    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    iget-object v10, v1, Ll5/d;->r:Lm3/l;

    .line 111
    .line 112
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    invoke-virtual {v10, v7, v8, v6}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v10, v9}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 123
    .line 124
    .line 125
    const-class v6, Landroid/os/Bundle;

    .line 126
    .line 127
    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-virtual {v10, v6}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-virtual {v10}, Landroid/os/Parcel;->recycle()V

    .line 136
    .line 137
    .line 138
    const-string v7, "c"

    .line 139
    .line 140
    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    new-instance v10, Lo6/a;

    .line 148
    .line 149
    invoke-static {}, Lya/i0;->p()Lya/f0;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    if-ge v9, v13, :cond_5

    .line 158
    .line 159
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    check-cast v13, Landroid/os/Bundle;

    .line 164
    .line 165
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-static {v13}, Lo4/b;->b(Landroid/os/Bundle;)Lo4/b;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    invoke-virtual {v8, v13}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    add-int/lit8 v9, v9, 0x1

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_5
    invoke-virtual {v8}, Lya/f0;->f()Lya/a1;

    .line 179
    .line 180
    .line 181
    move-result-object v15

    .line 182
    const-string v7, "d"

    .line 183
    .line 184
    invoke-virtual {v6, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 185
    .line 186
    .line 187
    move-result-wide v13

    .line 188
    invoke-direct/range {v10 .. v15}, Lo6/a;-><init>(JJLjava/util/List;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Lu4/f;->h()V

    .line 192
    .line 193
    .line 194
    iget-object v0, v1, Ll5/d;->t:Ll5/a;

    .line 195
    .line 196
    invoke-interface {v0, v10, v2, v3}, Ll5/a;->b(Lo6/a;J)Z

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    :goto_1
    iget-object v0, v1, Ll5/d;->t:Ll5/a;

    .line 201
    .line 202
    iget-wide v6, v1, Ll5/d;->I:J

    .line 203
    .line 204
    invoke-interface {v0, v6, v7}, Ll5/a;->a(J)J

    .line 205
    .line 206
    .line 207
    move-result-wide v6

    .line 208
    const-wide/high16 v10, -0x8000000000000000L

    .line 209
    .line 210
    cmp-long v0, v6, v10

    .line 211
    .line 212
    if-nez v0, :cond_6

    .line 213
    .line 214
    iget-boolean v8, v1, Ll5/d;->F:Z

    .line 215
    .line 216
    if-eqz v8, :cond_6

    .line 217
    .line 218
    if-nez v9, :cond_6

    .line 219
    .line 220
    iput-boolean v4, v1, Ll5/d;->G:Z

    .line 221
    .line 222
    :cond_6
    if-eqz v0, :cond_7

    .line 223
    .line 224
    cmp-long v0, v6, v2

    .line 225
    .line 226
    if-gtz v0, :cond_7

    .line 227
    .line 228
    const/4 v9, 0x1

    .line 229
    :cond_7
    if-eqz v9, :cond_9

    .line 230
    .line 231
    iget-object v0, v1, Ll5/d;->t:Ll5/a;

    .line 232
    .line 233
    invoke-interface {v0, v2, v3}, Ll5/a;->c(J)Lya/i0;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    iget-object v6, v1, Ll5/d;->t:Ll5/a;

    .line 238
    .line 239
    invoke-interface {v6, v2, v3}, Ll5/a;->d(J)J

    .line 240
    .line 241
    .line 242
    move-result-wide v6

    .line 243
    new-instance v8, Lo4/c;

    .line 244
    .line 245
    invoke-virtual {v1, v6, v7}, Ll5/d;->C(J)J

    .line 246
    .line 247
    .line 248
    move-result-wide v9

    .line 249
    invoke-direct {v8, v9, v10, v0}, Lo4/c;-><init>(JLjava/util/List;)V

    .line 250
    .line 251
    .line 252
    if-eqz v5, :cond_8

    .line 253
    .line 254
    invoke-virtual {v5, v4, v8}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 259
    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_8
    invoke-virtual {v1, v8}, Ll5/d;->E(Lo4/c;)V

    .line 263
    .line 264
    .line 265
    :goto_2
    iget-object v0, v1, Ll5/d;->t:Ll5/a;

    .line 266
    .line 267
    invoke-interface {v0, v6, v7}, Ll5/a;->e(J)V

    .line 268
    .line 269
    .line 270
    :cond_9
    iput-wide v2, v1, Ll5/d;->I:J

    .line 271
    .line 272
    return-void

    .line 273
    :cond_a
    invoke-virtual {v1}, Ll5/d;->A()V

    .line 274
    .line 275
    .line 276
    iput-wide v2, v1, Ll5/d;->I:J

    .line 277
    .line 278
    iget-object v0, v1, Ll5/d;->A:Lo6/c;

    .line 279
    .line 280
    const-string v10, "Subtitle decoding failed. streamFormat="

    .line 281
    .line 282
    const-string v11, "TextRenderer"

    .line 283
    .line 284
    const/4 v12, 0x0

    .line 285
    if-nez v0, :cond_c

    .line 286
    .line 287
    iget-object v0, v1, Ll5/d;->x:Lo6/e;

    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-interface {v0, v2, v3}, Lo6/e;->d(J)V

    .line 293
    .line 294
    .line 295
    :try_start_0
    iget-object v0, v1, Ll5/d;->x:Lo6/e;

    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-interface {v0}, Lu4/c;->e()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    check-cast v0, Lo6/c;

    .line 305
    .line 306
    iput-object v0, v1, Ll5/d;->A:Lo6/c;
    :try_end_0
    .catch Lo6/f; {:try_start_0 .. :try_end_0} :catch_0

    .line 307
    .line 308
    goto :goto_4

    .line 309
    :catch_0
    move-exception v0

    .line 310
    new-instance v2, Ljava/lang/StringBuilder;

    .line 311
    .line 312
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    iget-object v3, v1, Ll5/d;->H:Lm4/q;

    .line 316
    .line 317
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    invoke-static {v11, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 325
    .line 326
    .line 327
    new-instance v0, Lo4/c;

    .line 328
    .line 329
    sget-object v2, Lya/a1;->e:Lya/a1;

    .line 330
    .line 331
    iget-wide v6, v1, Ll5/d;->I:J

    .line 332
    .line 333
    invoke-virtual {v1, v6, v7}, Ll5/d;->C(J)J

    .line 334
    .line 335
    .line 336
    move-result-wide v6

    .line 337
    invoke-direct {v0, v6, v7, v2}, Lo4/c;-><init>(JLjava/util/List;)V

    .line 338
    .line 339
    .line 340
    if-eqz v5, :cond_b

    .line 341
    .line 342
    invoke-virtual {v5, v4, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 347
    .line 348
    .line 349
    goto :goto_3

    .line 350
    :cond_b
    invoke-virtual {v1, v0}, Ll5/d;->E(Lo4/c;)V

    .line 351
    .line 352
    .line 353
    :goto_3
    invoke-virtual {v1}, Ll5/d;->F()V

    .line 354
    .line 355
    .line 356
    iget-object v0, v1, Ll5/d;->x:Lo6/e;

    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    invoke-interface {v0}, Lu4/c;->a()V

    .line 362
    .line 363
    .line 364
    iput-object v12, v1, Ll5/d;->x:Lo6/e;

    .line 365
    .line 366
    iput v9, v1, Ll5/d;->w:I

    .line 367
    .line 368
    invoke-virtual {v1}, Ll5/d;->D()V

    .line 369
    .line 370
    .line 371
    goto/16 :goto_10

    .line 372
    .line 373
    :cond_c
    :goto_4
    iget v0, v1, Lv4/e;->h:I

    .line 374
    .line 375
    const/4 v13, 0x2

    .line 376
    if-eq v0, v13, :cond_d

    .line 377
    .line 378
    goto/16 :goto_10

    .line 379
    .line 380
    :cond_d
    iget-object v0, v1, Ll5/d;->z:Lo6/c;

    .line 381
    .line 382
    if-eqz v0, :cond_e

    .line 383
    .line 384
    invoke-virtual {v1}, Ll5/d;->B()J

    .line 385
    .line 386
    .line 387
    move-result-wide v14

    .line 388
    const/4 v0, 0x0

    .line 389
    :goto_5
    cmp-long v16, v14, v2

    .line 390
    .line 391
    if-gtz v16, :cond_f

    .line 392
    .line 393
    iget v0, v1, Ll5/d;->B:I

    .line 394
    .line 395
    add-int/2addr v0, v4

    .line 396
    iput v0, v1, Ll5/d;->B:I

    .line 397
    .line 398
    invoke-virtual {v1}, Ll5/d;->B()J

    .line 399
    .line 400
    .line 401
    move-result-wide v14

    .line 402
    const/4 v0, 0x1

    .line 403
    goto :goto_5

    .line 404
    :cond_e
    const/4 v0, 0x0

    .line 405
    :cond_f
    iget-object v14, v1, Ll5/d;->A:Lo6/c;

    .line 406
    .line 407
    if-eqz v14, :cond_10

    .line 408
    .line 409
    invoke-virtual {v14, v6}, Lq4/d;->d(I)Z

    .line 410
    .line 411
    .line 412
    move-result v15

    .line 413
    if-eqz v15, :cond_12

    .line 414
    .line 415
    if-nez v0, :cond_10

    .line 416
    .line 417
    invoke-virtual {v1}, Ll5/d;->B()J

    .line 418
    .line 419
    .line 420
    move-result-wide v14

    .line 421
    const-wide v16, 0x7fffffffffffffffL

    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    cmp-long v18, v14, v16

    .line 427
    .line 428
    if-nez v18, :cond_10

    .line 429
    .line 430
    iget v14, v1, Ll5/d;->w:I

    .line 431
    .line 432
    if-ne v14, v13, :cond_11

    .line 433
    .line 434
    invoke-virtual {v1}, Ll5/d;->F()V

    .line 435
    .line 436
    .line 437
    iget-object v14, v1, Ll5/d;->x:Lo6/e;

    .line 438
    .line 439
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    invoke-interface {v14}, Lu4/c;->a()V

    .line 443
    .line 444
    .line 445
    iput-object v12, v1, Ll5/d;->x:Lo6/e;

    .line 446
    .line 447
    iput v9, v1, Ll5/d;->w:I

    .line 448
    .line 449
    invoke-virtual {v1}, Ll5/d;->D()V

    .line 450
    .line 451
    .line 452
    :cond_10
    :goto_6
    move-object v15, v8

    .line 453
    goto :goto_7

    .line 454
    :cond_11
    invoke-virtual {v1}, Ll5/d;->F()V

    .line 455
    .line 456
    .line 457
    iput-boolean v4, v1, Ll5/d;->G:Z

    .line 458
    .line 459
    goto :goto_6

    .line 460
    :cond_12
    move-object v15, v8

    .line 461
    iget-wide v7, v14, Lu4/g;->c:J

    .line 462
    .line 463
    cmp-long v16, v7, v2

    .line 464
    .line 465
    if-gtz v16, :cond_14

    .line 466
    .line 467
    iget-object v0, v1, Ll5/d;->z:Lo6/c;

    .line 468
    .line 469
    if-eqz v0, :cond_13

    .line 470
    .line 471
    invoke-virtual {v0}, Lu4/g;->i()V

    .line 472
    .line 473
    .line 474
    :cond_13
    invoke-virtual {v14, v2, v3}, Lo6/c;->a(J)I

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    iput v0, v1, Ll5/d;->B:I

    .line 479
    .line 480
    iput-object v14, v1, Ll5/d;->z:Lo6/c;

    .line 481
    .line 482
    iput-object v12, v1, Ll5/d;->A:Lo6/c;

    .line 483
    .line 484
    const/4 v0, 0x1

    .line 485
    :cond_14
    :goto_7
    if-eqz v0, :cond_19

    .line 486
    .line 487
    iget-object v0, v1, Ll5/d;->z:Lo6/c;

    .line 488
    .line 489
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    iget-object v0, v1, Ll5/d;->z:Lo6/c;

    .line 493
    .line 494
    invoke-virtual {v0, v2, v3}, Lo6/c;->a(J)I

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    if-eqz v0, :cond_17

    .line 499
    .line 500
    iget-object v7, v1, Ll5/d;->z:Lo6/c;

    .line 501
    .line 502
    invoke-virtual {v7}, Lo6/c;->g()I

    .line 503
    .line 504
    .line 505
    move-result v7

    .line 506
    if-nez v7, :cond_15

    .line 507
    .line 508
    goto :goto_8

    .line 509
    :cond_15
    const/4 v7, -0x1

    .line 510
    if-ne v0, v7, :cond_16

    .line 511
    .line 512
    iget-object v0, v1, Ll5/d;->z:Lo6/c;

    .line 513
    .line 514
    invoke-virtual {v0}, Lo6/c;->g()I

    .line 515
    .line 516
    .line 517
    move-result v7

    .line 518
    sub-int/2addr v7, v4

    .line 519
    invoke-virtual {v0, v7}, Lo6/c;->e(I)J

    .line 520
    .line 521
    .line 522
    move-result-wide v7

    .line 523
    goto :goto_9

    .line 524
    :cond_16
    iget-object v7, v1, Ll5/d;->z:Lo6/c;

    .line 525
    .line 526
    sub-int/2addr v0, v4

    .line 527
    invoke-virtual {v7, v0}, Lo6/c;->e(I)J

    .line 528
    .line 529
    .line 530
    move-result-wide v7

    .line 531
    goto :goto_9

    .line 532
    :cond_17
    :goto_8
    iget-object v0, v1, Ll5/d;->z:Lo6/c;

    .line 533
    .line 534
    iget-wide v7, v0, Lu4/g;->c:J

    .line 535
    .line 536
    :goto_9
    invoke-virtual {v1, v7, v8}, Ll5/d;->C(J)J

    .line 537
    .line 538
    .line 539
    move-result-wide v7

    .line 540
    new-instance v0, Lo4/c;

    .line 541
    .line 542
    iget-object v14, v1, Ll5/d;->z:Lo6/c;

    .line 543
    .line 544
    invoke-virtual {v14, v2, v3}, Lo6/c;->f(J)Ljava/util/List;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    invoke-direct {v0, v7, v8, v2}, Lo4/c;-><init>(JLjava/util/List;)V

    .line 549
    .line 550
    .line 551
    if-eqz v5, :cond_18

    .line 552
    .line 553
    invoke-virtual {v5, v4, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 558
    .line 559
    .line 560
    goto :goto_a

    .line 561
    :cond_18
    invoke-virtual {v1, v0}, Ll5/d;->E(Lo4/c;)V

    .line 562
    .line 563
    .line 564
    :cond_19
    :goto_a
    iget v0, v1, Ll5/d;->w:I

    .line 565
    .line 566
    if-ne v0, v13, :cond_1a

    .line 567
    .line 568
    goto/16 :goto_10

    .line 569
    .line 570
    :cond_1a
    :goto_b
    :try_start_1
    iget-boolean v0, v1, Ll5/d;->F:Z

    .line 571
    .line 572
    if-nez v0, :cond_22

    .line 573
    .line 574
    iget-object v0, v1, Ll5/d;->y:Lo6/i;

    .line 575
    .line 576
    if-nez v0, :cond_1c

    .line 577
    .line 578
    iget-object v0, v1, Ll5/d;->x:Lo6/e;

    .line 579
    .line 580
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    invoke-interface {v0}, Lu4/c;->f()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    check-cast v0, Lo6/i;

    .line 588
    .line 589
    if-nez v0, :cond_1b

    .line 590
    .line 591
    goto/16 :goto_10

    .line 592
    .line 593
    :cond_1b
    iput-object v0, v1, Ll5/d;->y:Lo6/i;

    .line 594
    .line 595
    goto :goto_c

    .line 596
    :catch_1
    move-exception v0

    .line 597
    goto :goto_e

    .line 598
    :cond_1c
    :goto_c
    iget v2, v1, Ll5/d;->w:I

    .line 599
    .line 600
    if-ne v2, v4, :cond_1d

    .line 601
    .line 602
    iput v6, v0, Lq4/d;->b:I

    .line 603
    .line 604
    iget-object v2, v1, Ll5/d;->x:Lo6/e;

    .line 605
    .line 606
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    invoke-interface {v2, v0}, Lu4/c;->b(Lo6/i;)V

    .line 610
    .line 611
    .line 612
    iput-object v12, v1, Ll5/d;->y:Lo6/i;

    .line 613
    .line 614
    iput v13, v1, Ll5/d;->w:I

    .line 615
    .line 616
    return-void

    .line 617
    :cond_1d
    invoke-virtual {v1, v15, v0, v9}, Lv4/e;->u(Lv2/e;Lu4/f;I)I

    .line 618
    .line 619
    .line 620
    move-result v2

    .line 621
    const/4 v3, -0x4

    .line 622
    if-ne v2, v3, :cond_20

    .line 623
    .line 624
    invoke-virtual {v0, v6}, Lq4/d;->d(I)Z

    .line 625
    .line 626
    .line 627
    move-result v2

    .line 628
    if-eqz v2, :cond_1e

    .line 629
    .line 630
    iput-boolean v4, v1, Ll5/d;->F:Z

    .line 631
    .line 632
    iput-boolean v9, v1, Ll5/d;->v:Z

    .line 633
    .line 634
    goto :goto_d

    .line 635
    :cond_1e
    iget-object v2, v15, Lv2/e;->c:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v2, Lm4/q;

    .line 638
    .line 639
    if-nez v2, :cond_1f

    .line 640
    .line 641
    goto :goto_10

    .line 642
    :cond_1f
    iget-wide v7, v2, Lm4/q;->s:J

    .line 643
    .line 644
    iput-wide v7, v0, Lo6/i;->j:J

    .line 645
    .line 646
    invoke-virtual {v0}, Lu4/f;->k()V

    .line 647
    .line 648
    .line 649
    iget-boolean v2, v1, Ll5/d;->v:Z

    .line 650
    .line 651
    invoke-virtual {v0, v4}, Lq4/d;->d(I)Z

    .line 652
    .line 653
    .line 654
    move-result v7

    .line 655
    xor-int/2addr v7, v4

    .line 656
    and-int/2addr v2, v7

    .line 657
    iput-boolean v2, v1, Ll5/d;->v:Z

    .line 658
    .line 659
    :goto_d
    iget-boolean v2, v1, Ll5/d;->v:Z

    .line 660
    .line 661
    if-nez v2, :cond_1a

    .line 662
    .line 663
    iget-object v2, v1, Ll5/d;->x:Lo6/e;

    .line 664
    .line 665
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 666
    .line 667
    .line 668
    invoke-interface {v2, v0}, Lu4/c;->b(Lo6/i;)V

    .line 669
    .line 670
    .line 671
    iput-object v12, v1, Ll5/d;->y:Lo6/i;
    :try_end_1
    .catch Lo6/f; {:try_start_1 .. :try_end_1} :catch_1

    .line 672
    .line 673
    goto :goto_b

    .line 674
    :cond_20
    const/4 v0, -0x3

    .line 675
    if-ne v2, v0, :cond_1a

    .line 676
    .line 677
    goto :goto_10

    .line 678
    :goto_e
    new-instance v2, Ljava/lang/StringBuilder;

    .line 679
    .line 680
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    iget-object v3, v1, Ll5/d;->H:Lm4/q;

    .line 684
    .line 685
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    invoke-static {v11, v2, v0}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 693
    .line 694
    .line 695
    new-instance v0, Lo4/c;

    .line 696
    .line 697
    sget-object v2, Lya/a1;->e:Lya/a1;

    .line 698
    .line 699
    iget-wide v6, v1, Ll5/d;->I:J

    .line 700
    .line 701
    invoke-virtual {v1, v6, v7}, Ll5/d;->C(J)J

    .line 702
    .line 703
    .line 704
    move-result-wide v6

    .line 705
    invoke-direct {v0, v6, v7, v2}, Lo4/c;-><init>(JLjava/util/List;)V

    .line 706
    .line 707
    .line 708
    if-eqz v5, :cond_21

    .line 709
    .line 710
    invoke-virtual {v5, v4, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 715
    .line 716
    .line 717
    goto :goto_f

    .line 718
    :cond_21
    invoke-virtual {v1, v0}, Ll5/d;->E(Lo4/c;)V

    .line 719
    .line 720
    .line 721
    :goto_f
    invoke-virtual {v1}, Ll5/d;->F()V

    .line 722
    .line 723
    .line 724
    iget-object v0, v1, Ll5/d;->x:Lo6/e;

    .line 725
    .line 726
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 727
    .line 728
    .line 729
    invoke-interface {v0}, Lu4/c;->a()V

    .line 730
    .line 731
    .line 732
    iput-object v12, v1, Ll5/d;->x:Lo6/e;

    .line 733
    .line 734
    iput v9, v1, Ll5/d;->w:I

    .line 735
    .line 736
    invoke-virtual {v1}, Ll5/d;->D()V

    .line 737
    .line 738
    .line 739
    :cond_22
    :goto_10
    return-void
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
.end method

.method public final y(Lm4/q;)I
    .locals 3

    .line 1
    iget-object v0, p1, Lm4/q;->n:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "application/x-media3-cues"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p1, Lm4/q;->n:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Ll5/d;->u:Ll5/c;

    .line 15
    .line 16
    check-cast v0, Li7/p2;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, Li7/p2;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lm3/l;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lm3/l;->k(Lm4/q;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    const-string v0, "application/cea-608"

    .line 32
    .line 33
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const-string v0, "application/x-mp4-cea-608"

    .line 40
    .line 41
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    const-string v0, "application/cea-708"

    .line 48
    .line 49
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-static {v1}, Lm4/o0;->n(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    const/4 p1, 0x1

    .line 63
    invoke-static {p1, v2, v2, v2}, Lq/t0;->g(IIII)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1

    .line 68
    :cond_1
    invoke-static {v2, v2, v2, v2}, Lq/t0;->g(IIII)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    return p1

    .line 73
    :cond_2
    :goto_0
    iget p1, p1, Lm4/q;->M:I

    .line 74
    .line 75
    if-nez p1, :cond_3

    .line 76
    .line 77
    const/4 p1, 0x4

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    const/4 p1, 0x2

    .line 80
    :goto_1
    invoke-static {p1, v2, v2, v2}, Lq/t0;->g(IIII)I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    return p1
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
