.class public final synthetic Lb7/c3;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lb7/p3;
.implements Lp4/g;
.implements Lxa/d;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb7/c3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lj2/t1;)V
    .locals 0

    .line 2
    const/16 p1, 0xf

    iput p1, p0, Lb7/c3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([BI)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    :try_start_0
    invoke-static {p0, p1, v0}, Lnd/h;->f([BII)Landroid/graphics/Bitmap;

    .line 3
    .line 4
    .line 5
    move-result-object p0
    :try_end_0
    .catch Lm4/p0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    return-object p0

    .line 7
    :catch_0
    move-exception p0

    .line 8
    new-instance p1, Lf5/d;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    throw p1

    .line 14
    :catch_1
    move-exception v0

    .line 15
    new-instance v1, Lf5/d;

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v3, "Could not decode image data with BitmapFactory. (data.length = "

    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    array-length p0, p0

    .line 25
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, ", input length = "

    .line 29
    .line 30
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p0, ")"

    .line 37
    .line 38
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {v1, p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    throw v1
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


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lb7/c3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    check-cast p1, Lj5/z0;

    .line 7
    .line 8
    iget-object p1, p1, Lj5/z0;->b:Lb5/s;

    .line 9
    .line 10
    invoke-interface {p1}, Lb5/s;->a()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_1
    check-cast p1, Lb7/z3;

    .line 15
    .line 16
    invoke-virtual {p1}, Lb7/z3;->r0()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p1, Lb7/z3;->a:Landroidx/media3/exoplayer/ExoPlayer;

    .line 20
    .line 21
    check-cast p1, Landroidx/lifecycle/q;

    .line 22
    .line 23
    const v0, 0x7fffffff

    .line 24
    .line 25
    .line 26
    check-cast p1, Lv4/v;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {p1, v1, v0}, Lv4/v;->V1(II)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_2
    check-cast p1, Lb7/z3;

    .line 34
    .line 35
    invoke-virtual {p1}, Lb7/z3;->v()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_3
    check-cast p1, Lb7/z3;

    .line 40
    .line 41
    invoke-virtual {p1}, Lb7/z3;->c()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_4
    check-cast p1, Lb7/z3;

    .line 46
    .line 47
    invoke-virtual {p1}, Lb7/z3;->p0()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
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

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lb7/c3;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Landroid/os/Bundle;

    .line 11
    .line 12
    sget-object v2, Lm4/h1;->t:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-static {v2}, Lm4/i0;->a(Landroid/os/Bundle;)Lm4/i0;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :goto_0
    move-object v5, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    sget-object v2, Lm4/i0;->g:Lm4/i0;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    sget-object v2, Lm4/h1;->u:Ljava/lang/String;

    .line 30
    .line 31
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    sget-object v2, Lm4/h1;->v:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v9

    .line 46
    sget-object v2, Lm4/h1;->w:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 49
    .line 50
    .line 51
    move-result-wide v11

    .line 52
    sget-object v2, Lm4/h1;->x:Ljava/lang/String;

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    invoke-virtual {v1, v2, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 56
    .line 57
    .line 58
    move-result v13

    .line 59
    sget-object v2, Lm4/h1;->y:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v1, v2, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v14

    .line 65
    sget-object v2, Lm4/h1;->z:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    invoke-static {v2}, Lm4/c0;->b(Landroid/os/Bundle;)Lm4/c0;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    :goto_2
    move-object v15, v2

    .line 78
    goto :goto_3

    .line 79
    :cond_1
    const/4 v2, 0x0

    .line 80
    goto :goto_2

    .line 81
    :goto_3
    sget-object v2, Lm4/h1;->A:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v1, v2, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    sget-object v6, Lm4/h1;->B:Ljava/lang/String;

    .line 88
    .line 89
    const-wide/16 v3, 0x0

    .line 90
    .line 91
    invoke-virtual {v1, v6, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 92
    .line 93
    .line 94
    move-result-wide v18

    .line 95
    sget-object v6, Lm4/h1;->C:Ljava/lang/String;

    .line 96
    .line 97
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v6, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    sget-object v6, Lm4/h1;->D:Ljava/lang/String;

    .line 107
    .line 108
    const/4 v0, 0x0

    .line 109
    invoke-virtual {v1, v6, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    move-wide/from16 v16, v3

    .line 114
    .line 115
    sget-object v3, Lm4/h1;->E:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v1, v3, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    sget-object v3, Lm4/h1;->F:Ljava/lang/String;

    .line 122
    .line 123
    move-object/from16 p1, v5

    .line 124
    .line 125
    const-wide/16 v4, 0x0

    .line 126
    .line 127
    invoke-virtual {v1, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 128
    .line 129
    .line 130
    move-result-wide v22

    .line 131
    new-instance v3, Lm4/h1;

    .line 132
    .line 133
    invoke-direct {v3}, Lm4/h1;-><init>()V

    .line 134
    .line 135
    .line 136
    sget-object v4, Lm4/h1;->r:Ljava/lang/Object;

    .line 137
    .line 138
    move/from16 v20, v6

    .line 139
    .line 140
    const/4 v6, 0x0

    .line 141
    move-wide/from16 v24, v18

    .line 142
    .line 143
    move-wide/from16 v18, v16

    .line 144
    .line 145
    move-wide/from16 v16, v24

    .line 146
    .line 147
    move-object/from16 v5, p1

    .line 148
    .line 149
    move/from16 v21, v0

    .line 150
    .line 151
    invoke-virtual/range {v3 .. v23}, Lm4/h1;->b(Ljava/lang/Object;Lm4/i0;Ljava/lang/Object;JJJZZLm4/c0;JJIIJ)V

    .line 152
    .line 153
    .line 154
    iput-boolean v2, v3, Lm4/h1;->k:Z

    .line 155
    .line 156
    return-object v3

    .line 157
    :pswitch_1
    move-object/from16 v0, p1

    .line 158
    .line 159
    check-cast v0, Landroid/os/Bundle;

    .line 160
    .line 161
    sget-object v1, Lm4/h0;->h:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    check-cast v1, Landroid/net/Uri;

    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    sget-object v2, Lm4/h0;->i:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    sget-object v3, Lm4/h0;->j:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    sget-object v4, Lm4/h0;->k:Ljava/lang/String;

    .line 185
    .line 186
    const/4 v5, 0x0

    .line 187
    invoke-virtual {v0, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    sget-object v6, Lm4/h0;->l:Ljava/lang/String;

    .line 192
    .line 193
    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    sget-object v6, Lm4/h0;->m:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    sget-object v7, Lm4/h0;->n:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {v0, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    new-instance v7, Lm4/g0;

    .line 210
    .line 211
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 212
    .line 213
    .line 214
    iput-object v1, v7, Lm4/g0;->a:Landroid/net/Uri;

    .line 215
    .line 216
    invoke-static {v2}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    iput-object v1, v7, Lm4/g0;->b:Ljava/lang/String;

    .line 221
    .line 222
    iput-object v3, v7, Lm4/g0;->c:Ljava/lang/String;

    .line 223
    .line 224
    iput v4, v7, Lm4/g0;->d:I

    .line 225
    .line 226
    iput v5, v7, Lm4/g0;->e:I

    .line 227
    .line 228
    iput-object v6, v7, Lm4/g0;->f:Ljava/lang/String;

    .line 229
    .line 230
    iput-object v0, v7, Lm4/g0;->g:Ljava/lang/String;

    .line 231
    .line 232
    new-instance v0, Lm4/h0;

    .line 233
    .line 234
    invoke-direct {v0, v7}, Lm4/h0;-><init>(Lm4/g0;)V

    .line 235
    .line 236
    .line 237
    return-object v0

    .line 238
    :pswitch_2
    move-object/from16 v0, p1

    .line 239
    .line 240
    check-cast v0, Lm4/h0;

    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    new-instance v1, Landroid/os/Bundle;

    .line 246
    .line 247
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 248
    .line 249
    .line 250
    sget-object v2, Lm4/h0;->h:Ljava/lang/String;

    .line 251
    .line 252
    iget-object v3, v0, Lm4/h0;->a:Landroid/net/Uri;

    .line 253
    .line 254
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 255
    .line 256
    .line 257
    iget-object v2, v0, Lm4/h0;->b:Ljava/lang/String;

    .line 258
    .line 259
    if-eqz v2, :cond_2

    .line 260
    .line 261
    sget-object v3, Lm4/h0;->i:Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    :cond_2
    iget-object v2, v0, Lm4/h0;->c:Ljava/lang/String;

    .line 267
    .line 268
    if-eqz v2, :cond_3

    .line 269
    .line 270
    sget-object v3, Lm4/h0;->j:Ljava/lang/String;

    .line 271
    .line 272
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    :cond_3
    iget v2, v0, Lm4/h0;->d:I

    .line 276
    .line 277
    if-eqz v2, :cond_4

    .line 278
    .line 279
    sget-object v3, Lm4/h0;->k:Ljava/lang/String;

    .line 280
    .line 281
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 282
    .line 283
    .line 284
    :cond_4
    iget v2, v0, Lm4/h0;->e:I

    .line 285
    .line 286
    if-eqz v2, :cond_5

    .line 287
    .line 288
    sget-object v3, Lm4/h0;->l:Ljava/lang/String;

    .line 289
    .line 290
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 291
    .line 292
    .line 293
    :cond_5
    iget-object v2, v0, Lm4/h0;->f:Ljava/lang/String;

    .line 294
    .line 295
    if-eqz v2, :cond_6

    .line 296
    .line 297
    sget-object v3, Lm4/h0;->m:Ljava/lang/String;

    .line 298
    .line 299
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    :cond_6
    iget-object v0, v0, Lm4/h0;->g:Ljava/lang/String;

    .line 303
    .line 304
    if-eqz v0, :cond_7

    .line 305
    .line 306
    sget-object v2, Lm4/h0;->n:Ljava/lang/String;

    .line 307
    .line 308
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    :cond_7
    return-object v1

    .line 312
    :pswitch_3
    move-object/from16 v0, p1

    .line 313
    .line 314
    check-cast v0, Lm4/b1;

    .line 315
    .line 316
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    new-instance v1, Landroid/os/Bundle;

    .line 320
    .line 321
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 322
    .line 323
    .line 324
    iget v2, v0, Lm4/b1;->a:I

    .line 325
    .line 326
    if-eqz v2, :cond_8

    .line 327
    .line 328
    sget-object v3, Lm4/b1;->d:Ljava/lang/String;

    .line 329
    .line 330
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 331
    .line 332
    .line 333
    :cond_8
    iget v2, v0, Lm4/b1;->b:I

    .line 334
    .line 335
    if-eqz v2, :cond_9

    .line 336
    .line 337
    sget-object v3, Lm4/b1;->e:Ljava/lang/String;

    .line 338
    .line 339
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 340
    .line 341
    .line 342
    :cond_9
    iget v0, v0, Lm4/b1;->c:I

    .line 343
    .line 344
    if-eqz v0, :cond_a

    .line 345
    .line 346
    sget-object v2, Lm4/b1;->f:Ljava/lang/String;

    .line 347
    .line 348
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 349
    .line 350
    .line 351
    :cond_a
    return-object v1

    .line 352
    :pswitch_4
    move-object/from16 v0, p1

    .line 353
    .line 354
    check-cast v0, Lm4/u;

    .line 355
    .line 356
    new-instance v1, Ljava/lang/StringBuilder;

    .line 357
    .line 358
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 359
    .line 360
    .line 361
    iget-object v2, v0, Lm4/u;->a:Ljava/lang/String;

    .line 362
    .line 363
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    const-string v2, ": "

    .line 367
    .line 368
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    iget-object v0, v0, Lm4/u;->b:Ljava/lang/String;

    .line 372
    .line 373
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    return-object v0

    .line 381
    :pswitch_5
    move-object/from16 v0, p1

    .line 382
    .line 383
    check-cast v0, Ll6/q;

    .line 384
    .line 385
    return-object v0

    .line 386
    :pswitch_6
    move-object/from16 v0, p1

    .line 387
    .line 388
    check-cast v0, Lo6/a;

    .line 389
    .line 390
    iget-wide v0, v0, Lo6/a;->c:J

    .line 391
    .line 392
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    return-object v0

    .line 397
    :pswitch_7
    move-object/from16 v0, p1

    .line 398
    .line 399
    check-cast v0, Lo6/a;

    .line 400
    .line 401
    iget-wide v0, v0, Lo6/a;->b:J

    .line 402
    .line 403
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    return-object v0

    .line 408
    :pswitch_8
    move-object/from16 v0, p1

    .line 409
    .line 410
    check-cast v0, Lm4/j1;

    .line 411
    .line 412
    iget v0, v0, Lm4/j1;->c:I

    .line 413
    .line 414
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    return-object v0

    .line 419
    :pswitch_9
    move-object/from16 v0, p1

    .line 420
    .line 421
    check-cast v0, Lj5/b0;

    .line 422
    .line 423
    invoke-interface {v0}, Lj5/b0;->q()Lj5/o1;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    iget-object v0, v0, Lj5/o1;->b:Lya/a1;

    .line 428
    .line 429
    new-instance v1, Lb7/c3;

    .line 430
    .line 431
    const/16 v2, 0x13

    .line 432
    .line 433
    invoke-direct {v1, v2}, Lb7/c3;-><init>(I)V

    .line 434
    .line 435
    .line 436
    invoke-static {v0, v1}, Lya/q;->v(Ljava/util/List;Lxa/d;)Ljava/util/AbstractList;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-static {v0}, Lya/i0;->q(Ljava/util/Collection;)Lya/i0;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    return-object v0

    .line 445
    :pswitch_a
    move-object/from16 v0, p1

    .line 446
    .line 447
    check-cast v0, Lr5/n;

    .line 448
    .line 449
    invoke-interface {v0}, Lr5/n;->c()Lr5/n;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    return-object v0

    .line 462
    :pswitch_b
    move-object/from16 v0, p1

    .line 463
    .line 464
    check-cast v0, Lc5/q;

    .line 465
    .line 466
    invoke-virtual {v0}, Lc5/q;->j()V

    .line 467
    .line 468
    .line 469
    iget-object v0, v0, Lc5/q;->I:Lj5/o1;

    .line 470
    .line 471
    iget-object v0, v0, Lj5/o1;->b:Lya/a1;

    .line 472
    .line 473
    new-instance v1, Lb7/c3;

    .line 474
    .line 475
    const/16 v2, 0x13

    .line 476
    .line 477
    invoke-direct {v1, v2}, Lb7/c3;-><init>(I)V

    .line 478
    .line 479
    .line 480
    invoke-static {v0, v1}, Lya/q;->v(Ljava/util/List;Lxa/d;)Ljava/util/AbstractList;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-static {v0}, Lya/i0;->q(Ljava/util/Collection;)Lya/i0;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    return-object v0

    .line 489
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
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

.method public h(Lb7/c2;Lb7/t1;I)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p3, p0, Lb7/c3;->a:I

    .line 2
    .line 3
    sparse-switch p3, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p3, p1, Lb7/c2;->e:Lpe/d;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lb7/c2;->r(Lb7/t1;)Lb7/t1;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance p1, Lb7/i4;

    .line 15
    .line 16
    const/4 p2, -0x6

    .line 17
    invoke-direct {p1, p2}, Lb7/i4;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lg8/a;->Q(Ljava/lang/Object;)Lcb/v;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :sswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance p1, Ljava/lang/ClassCastException;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :sswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance p1, Ljava/lang/ClassCastException;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :sswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance p1, Ljava/lang/ClassCastException;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :sswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance p1, Ljava/lang/ClassCastException;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x2 -> :sswitch_2
        0x5 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
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
