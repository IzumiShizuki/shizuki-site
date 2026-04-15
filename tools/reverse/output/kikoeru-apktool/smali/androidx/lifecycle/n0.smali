.class public final synthetic Landroidx/lifecycle/n0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/lifecycle/n0;->a:I

    iput-object p2, p0, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lda/m0;Landroidx/media3/exoplayer/offline/d;)V
    .locals 0

    .line 2
    const/4 p1, 0x6

    iput p1, p0, Landroidx/lifecycle/n0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    return-void
.end method

.method private final f()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls7/d;

    .line 4
    .line 5
    iget-object v0, v0, Ls7/d;->h:Lhf/r1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Lhf/k1;->g(Ljava/util/concurrent/CancellationException;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 14
    .line 15
    return-object v0
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

.method private final h()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsf/d;

    .line 4
    .line 5
    sget-object v1, Luf/c;->b:Luf/c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    new-array v2, v2, [Luf/g;

    .line 9
    .line 10
    new-instance v3, Le7/y;

    .line 11
    .line 12
    const/16 v4, 0xe

    .line 13
    .line 14
    invoke-direct {v3, v4, v0}, Le7/y;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const-string v4, "kotlinx.serialization.Polymorphic"

    .line 18
    .line 19
    invoke-static {v4, v1, v2, v3}, Lud/e;->f(Ljava/lang/String;Lud/n;[Luf/g;Lic/k;)Luf/h;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v0, v0, Lsf/d;->a:Lpc/c;

    .line 24
    .line 25
    const-string v2, "context"

    .line 26
    .line 27
    invoke-static {v0, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Luf/b;

    .line 31
    .line 32
    invoke-direct {v2, v1, v0}, Luf/b;-><init>(Luf/h;Lpc/c;)V

    .line 33
    .line 34
    .line 35
    return-object v2
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
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Landroidx/lifecycle/n0;->a:I

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    const/16 v3, 0x1f

    .line 7
    .line 8
    const/4 v4, -0x1

    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x5

    .line 11
    const/4 v7, 0x4

    .line 12
    const/4 v10, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lpc/v;

    .line 25
    .line 26
    invoke-interface {v0}, Lpc/v;->c()Lpc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :pswitch_0
    invoke-direct {v1}, Landroidx/lifecycle/n0;->h()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    :pswitch_1
    invoke-direct {v1}, Landroidx/lifecycle/n0;->f()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :pswitch_2
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ls0/i;

    .line 44
    .line 45
    iget-object v2, v0, Ls0/i;->o:Lx0/e1;

    .line 46
    .line 47
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lf3/k;

    .line 52
    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    iget-object v0, v0, Ls0/i;->p:Lx0/e1;

    .line 56
    .line 57
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lf3/l;

    .line 62
    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    const/4 v9, 0x1

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const/4 v9, 0x0

    .line 68
    :goto_0
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :pswitch_3
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lcom/cnl/kikoeru/MainActivity;

    .line 76
    .line 77
    sget-object v2, Lna/q;->a:Lub/p;

    .line 78
    .line 79
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 80
    .line 81
    const/16 v5, 0x21

    .line 82
    .line 83
    if-ge v2, v5, :cond_1

    .line 84
    .line 85
    new-instance v2, Lm3/k;

    .line 86
    .line 87
    invoke-direct {v2, v0}, Lm3/k;-><init>(Landroid/content/Context;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Lm3/k;->a()Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-nez v9, :cond_9

    .line 95
    .line 96
    invoke-static {v0}, Lna/q;->a(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_1
    sget-object v6, Lna/q;->b:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v0, v6}, Landroid/support/v4/media/session/b;->z(Landroid/content/Context;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-ne v7, v4, :cond_7

    .line 107
    .line 108
    if-ge v2, v5, :cond_3

    .line 109
    .line 110
    const-string v4, "android.permission.POST_NOTIFICATIONS"

    .line 111
    .line 112
    invoke-static {v4, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_3

    .line 117
    .line 118
    :cond_2
    const/4 v2, 0x0

    .line 119
    goto :goto_1

    .line 120
    :cond_3
    const/16 v4, 0x20

    .line 121
    .line 122
    if-lt v2, v4, :cond_4

    .line 123
    .line 124
    invoke-static {v0, v6}, Lc7/p0;->t(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    goto :goto_1

    .line 129
    :cond_4
    if-ne v2, v3, :cond_5

    .line 130
    .line 131
    invoke-static {v0, v6}, Lc7/p0;->s(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    goto :goto_1

    .line 136
    :cond_5
    const/16 v3, 0x17

    .line 137
    .line 138
    if-lt v2, v3, :cond_2

    .line 139
    .line 140
    invoke-static {v0, v6}, Lc7/p0;->r(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    :goto_1
    if-nez v2, :cond_6

    .line 145
    .line 146
    invoke-static {v0}, Lna/q;->a(Landroid/content/Context;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_6
    filled-new-array {v6}, [Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    const/16 v3, 0x64

    .line 155
    .line 156
    invoke-static {v0, v2, v3}, Landroid/support/v4/media/session/b;->W(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 157
    .line 158
    .line 159
    :cond_7
    :goto_2
    if-nez v7, :cond_8

    .line 160
    .line 161
    const/4 v9, 0x1

    .line 162
    goto :goto_3

    .line 163
    :cond_8
    const/4 v9, 0x0

    .line 164
    :cond_9
    :goto_3
    if-eqz v9, :cond_a

    .line 165
    .line 166
    const v0, 0x7f0c000d

    .line 167
    .line 168
    .line 169
    invoke-static {v0}, Lna/q;->g(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    const/4 v6, 0x0

    .line 174
    const/16 v7, 0x1ff

    .line 175
    .line 176
    const-wide/16 v3, 0x0

    .line 177
    .line 178
    const/4 v5, 0x0

    .line 179
    invoke-static/range {v2 .. v7}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 180
    .line 181
    .line 182
    :cond_a
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 183
    .line 184
    return-object v0

    .line 185
    :pswitch_4
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Ljc/y;

    .line 188
    .line 189
    iget-object v0, v0, Ljc/y;->a:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Lx0/w0;

    .line 192
    .line 193
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 194
    .line 195
    invoke-interface {v0, v2}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 199
    .line 200
    return-object v0

    .line 201
    :pswitch_5
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, Lbg/p;

    .line 204
    .line 205
    sget-object v2, Lg9/a;->a:Lef/l;

    .line 206
    .line 207
    iget-object v0, v0, Lbg/p;->a:Ljava/lang/String;

    .line 208
    .line 209
    const-string v2, "id"

    .line 210
    .line 211
    invoke-static {v0, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const-string v2, "https://www.asmr-300.com/playlist?id="

    .line 215
    .line 216
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-static {v0}, Lna/q;->f(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 224
    .line 225
    return-object v0

    .line 226
    :pswitch_6
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Lm0/w;

    .line 229
    .line 230
    const-string v2, ":memory:"

    .line 231
    .line 232
    invoke-virtual {v0, v2}, Lm0/w;->l(Ljava/lang/String;)Lz7/a;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    return-object v0

    .line 237
    :pswitch_7
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v0, Lmh/h;

    .line 240
    .line 241
    iget-object v2, v0, Lmh/h;->b:Ljava/lang/ClassLoader;

    .line 242
    .line 243
    iget-object v3, v0, Lmh/h;->c:Llh/l;

    .line 244
    .line 245
    const-string v0, ""

    .line 246
    .line 247
    invoke-virtual {v2, v0}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    const-string v5, "getResources(...)"

    .line 252
    .line 253
    invoke-static {v0, v5}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    const-string v6, "list(...)"

    .line 261
    .line 262
    invoke-static {v0, v6}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    new-instance v11, Ljava/util/ArrayList;

    .line 266
    .line 267
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    :cond_b
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v12

    .line 278
    if-eqz v12, :cond_d

    .line 279
    .line 280
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v12

    .line 284
    check-cast v12, Ljava/net/URL;

    .line 285
    .line 286
    invoke-static {v12}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v13

    .line 293
    const-string v14, "file"

    .line 294
    .line 295
    invoke-static {v13, v14}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v13

    .line 299
    if-nez v13, :cond_c

    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    goto :goto_5

    .line 303
    :cond_c
    sget-object v13, Llh/y;->b:Ljava/lang/String;

    .line 304
    .line 305
    new-instance v13, Ljava/io/File;

    .line 306
    .line 307
    invoke-virtual {v12}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 308
    .line 309
    .line 310
    move-result-object v12

    .line 311
    invoke-direct {v13, v12}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 312
    .line 313
    .line 314
    invoke-static {v13}, Lg5/w;->w(Ljava/io/File;)Llh/y;

    .line 315
    .line 316
    .line 317
    move-result-object v12

    .line 318
    new-instance v13, Lub/k;

    .line 319
    .line 320
    invoke-direct {v13, v3, v12}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    :goto_5
    if-eqz v13, :cond_b

    .line 324
    .line 325
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    goto :goto_4

    .line 329
    :cond_d
    const-string v0, "META-INF/MANIFEST.MF"

    .line 330
    .line 331
    invoke-virtual {v2, v0}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-static {v0, v5}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-static {v0, v6}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    new-instance v2, Ljava/util/ArrayList;

    .line 346
    .line 347
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 348
    .line 349
    .line 350
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-eqz v0, :cond_21

    .line 359
    .line 360
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    check-cast v0, Ljava/net/URL;

    .line 365
    .line 366
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    const-string v6, "toString(...)"

    .line 374
    .line 375
    invoke-static {v0, v6}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    const-string v6, "jar:file:"

    .line 379
    .line 380
    invoke-static {v0, v6, v10}, Lef/u;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 381
    .line 382
    .line 383
    move-result v6

    .line 384
    if-nez v6, :cond_e

    .line 385
    .line 386
    :goto_7
    move-object/from16 v20, v11

    .line 387
    .line 388
    const/4 v8, 0x0

    .line 389
    goto/16 :goto_18

    .line 390
    .line 391
    :cond_e
    const-string v6, "!"

    .line 392
    .line 393
    const/4 v12, 0x6

    .line 394
    invoke-static {v0, v10, v12, v6}, Lef/n;->B0(Ljava/lang/String;IILjava/lang/String;)I

    .line 395
    .line 396
    .line 397
    move-result v6

    .line 398
    if-ne v6, v4, :cond_f

    .line 399
    .line 400
    goto :goto_7

    .line 401
    :cond_f
    sget-object v12, Llh/y;->b:Ljava/lang/String;

    .line 402
    .line 403
    new-instance v12, Ljava/io/File;

    .line 404
    .line 405
    invoke-virtual {v0, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    const-string v6, "substring(...)"

    .line 410
    .line 411
    invoke-static {v0, v6}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-direct {v12, v0}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 419
    .line 420
    .line 421
    invoke-static {v12}, Lg5/w;->w(Ljava/io/File;)Llh/y;

    .line 422
    .line 423
    .line 424
    move-result-object v6

    .line 425
    const-string v0, "unsupported zip: spanned"

    .line 426
    .line 427
    const-string v12, "not a zip: size="

    .line 428
    .line 429
    invoke-virtual {v3, v6}, Llh/l;->D(Llh/y;)Llh/t;

    .line 430
    .line 431
    .line 432
    move-result-object v13

    .line 433
    :try_start_0
    invoke-virtual {v13}, Llh/t;->size()J

    .line 434
    .line 435
    .line 436
    move-result-wide v14

    .line 437
    const/16 v4, 0x16

    .line 438
    .line 439
    int-to-long v7, v4

    .line 440
    sub-long/2addr v14, v7

    .line 441
    const-wide/16 v7, 0x0

    .line 442
    .line 443
    cmp-long v4, v14, v7

    .line 444
    .line 445
    if-ltz v4, :cond_1f

    .line 446
    .line 447
    const-wide/32 v18, 0x10000

    .line 448
    .line 449
    .line 450
    move-object/from16 v20, v11

    .line 451
    .line 452
    sub-long v10, v14, v18

    .line 453
    .line 454
    invoke-static {v10, v11, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 455
    .line 456
    .line 457
    move-result-wide v10

    .line 458
    :goto_8
    invoke-virtual {v13, v14, v15}, Llh/t;->b(J)Llh/j;

    .line 459
    .line 460
    .line 461
    move-result-object v12

    .line 462
    invoke-static {v12}, Lg8/a;->l(Llh/h0;)Llh/b0;

    .line 463
    .line 464
    .line 465
    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 466
    :try_start_1
    invoke-virtual {v12}, Llh/b0;->i()I

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    move-wide/from16 v21, v7

    .line 471
    .line 472
    const v7, 0x6054b50

    .line 473
    .line 474
    .line 475
    if-ne v4, v7, :cond_1d

    .line 476
    .line 477
    invoke-virtual {v12}, Llh/b0;->n()S

    .line 478
    .line 479
    .line 480
    move-result v4

    .line 481
    const v7, 0xffff

    .line 482
    .line 483
    .line 484
    and-int/2addr v4, v7

    .line 485
    invoke-virtual {v12}, Llh/b0;->n()S

    .line 486
    .line 487
    .line 488
    move-result v8

    .line 489
    and-int/2addr v8, v7

    .line 490
    invoke-virtual {v12}, Llh/b0;->n()S

    .line 491
    .line 492
    .line 493
    move-result v10

    .line 494
    and-int/2addr v10, v7

    .line 495
    int-to-long v10, v10

    .line 496
    invoke-virtual {v12}, Llh/b0;->n()S

    .line 497
    .line 498
    .line 499
    move-result v19

    .line 500
    const v23, 0xffff

    .line 501
    .line 502
    .line 503
    and-int v7, v19, v23

    .line 504
    .line 505
    move-wide/from16 v25, v10

    .line 506
    .line 507
    int-to-long v9, v7

    .line 508
    cmp-long v7, v25, v9

    .line 509
    .line 510
    if-nez v7, :cond_1c

    .line 511
    .line 512
    if-nez v4, :cond_1c

    .line 513
    .line 514
    if-nez v8, :cond_1c

    .line 515
    .line 516
    const-wide/16 v7, 0x4

    .line 517
    .line 518
    invoke-virtual {v12, v7, v8}, Llh/b0;->skip(J)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12}, Llh/b0;->i()I

    .line 522
    .line 523
    .line 524
    move-result v4

    .line 525
    int-to-long v7, v4

    .line 526
    const-wide v9, 0xffffffffL

    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    and-long v27, v7, v9

    .line 532
    .line 533
    invoke-virtual {v12}, Llh/b0;->n()S

    .line 534
    .line 535
    .line 536
    move-result v4

    .line 537
    and-int v30, v4, v23

    .line 538
    .line 539
    new-instance v23, Lmh/f;

    .line 540
    .line 541
    move/from16 v24, v30

    .line 542
    .line 543
    invoke-direct/range {v23 .. v28}, Lmh/f;-><init>(IJJ)V

    .line 544
    .line 545
    .line 546
    move/from16 v4, v24

    .line 547
    .line 548
    int-to-long v7, v4

    .line 549
    invoke-virtual {v12, v7, v8}, Llh/b0;->o(J)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_b

    .line 550
    .line 551
    .line 552
    :try_start_2
    invoke-virtual {v12}, Llh/b0;->close()V

    .line 553
    .line 554
    .line 555
    const/16 v7, 0x14

    .line 556
    .line 557
    int-to-long v7, v7

    .line 558
    sub-long/2addr v14, v7

    .line 559
    cmp-long v7, v14, v21

    .line 560
    .line 561
    if-lez v7, :cond_15

    .line 562
    .line 563
    invoke-virtual {v13, v14, v15}, Llh/t;->b(J)Llh/j;

    .line 564
    .line 565
    .line 566
    move-result-object v7

    .line 567
    invoke-static {v7}, Lg8/a;->l(Llh/h0;)Llh/b0;

    .line 568
    .line 569
    .line 570
    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 571
    :try_start_3
    invoke-virtual {v7}, Llh/b0;->i()I

    .line 572
    .line 573
    .line 574
    move-result v8

    .line 575
    const v9, 0x7064b50

    .line 576
    .line 577
    .line 578
    if-ne v8, v9, :cond_14

    .line 579
    .line 580
    invoke-virtual {v7}, Llh/b0;->i()I

    .line 581
    .line 582
    .line 583
    move-result v8

    .line 584
    invoke-virtual {v7}, Llh/b0;->k()J

    .line 585
    .line 586
    .line 587
    move-result-wide v9

    .line 588
    invoke-virtual {v7}, Llh/b0;->i()I

    .line 589
    .line 590
    .line 591
    move-result v11

    .line 592
    const/4 v12, 0x1

    .line 593
    if-ne v11, v12, :cond_13

    .line 594
    .line 595
    if-nez v8, :cond_13

    .line 596
    .line 597
    invoke-virtual {v13, v9, v10}, Llh/t;->b(J)Llh/j;

    .line 598
    .line 599
    .line 600
    move-result-object v8

    .line 601
    invoke-static {v8}, Lg8/a;->l(Llh/h0;)Llh/b0;

    .line 602
    .line 603
    .line 604
    move-result-object v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 605
    :try_start_4
    invoke-virtual {v8}, Llh/b0;->i()I

    .line 606
    .line 607
    .line 608
    move-result v9

    .line 609
    const v10, 0x6064b50

    .line 610
    .line 611
    .line 612
    if-ne v9, v10, :cond_11

    .line 613
    .line 614
    const-wide/16 v9, 0xc

    .line 615
    .line 616
    invoke-virtual {v8, v9, v10}, Llh/b0;->skip(J)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v8}, Llh/b0;->i()I

    .line 620
    .line 621
    .line 622
    move-result v9

    .line 623
    invoke-virtual {v8}, Llh/b0;->i()I

    .line 624
    .line 625
    .line 626
    move-result v10

    .line 627
    invoke-virtual {v8}, Llh/b0;->k()J

    .line 628
    .line 629
    .line 630
    move-result-wide v31

    .line 631
    invoke-virtual {v8}, Llh/b0;->k()J

    .line 632
    .line 633
    .line 634
    move-result-wide v11

    .line 635
    cmp-long v14, v31, v11

    .line 636
    .line 637
    if-nez v14, :cond_10

    .line 638
    .line 639
    if-nez v9, :cond_10

    .line 640
    .line 641
    if-nez v10, :cond_10

    .line 642
    .line 643
    const-wide/16 v9, 0x8

    .line 644
    .line 645
    invoke-virtual {v8, v9, v10}, Llh/b0;->skip(J)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v8}, Llh/b0;->k()J

    .line 649
    .line 650
    .line 651
    move-result-wide v33

    .line 652
    new-instance v29, Lmh/f;

    .line 653
    .line 654
    move/from16 v30, v4

    .line 655
    .line 656
    invoke-direct/range {v29 .. v34}, Lmh/f;-><init>(IJJ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 657
    .line 658
    .line 659
    :try_start_5
    invoke-virtual {v8}, Llh/b0;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 660
    .line 661
    .line 662
    const/4 v0, 0x0

    .line 663
    goto :goto_9

    .line 664
    :catchall_0
    move-exception v0

    .line 665
    :goto_9
    move-object/from16 v23, v29

    .line 666
    .line 667
    goto :goto_d

    .line 668
    :cond_10
    :try_start_6
    new-instance v4, Ljava/io/IOException;

    .line 669
    .line 670
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 671
    .line 672
    .line 673
    throw v4

    .line 674
    :goto_a
    move-object v4, v0

    .line 675
    goto :goto_b

    .line 676
    :cond_11
    new-instance v0, Ljava/io/IOException;

    .line 677
    .line 678
    new-instance v4, Ljava/lang/StringBuilder;

    .line 679
    .line 680
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 681
    .line 682
    .line 683
    const-string v11, "bad zip: expected "

    .line 684
    .line 685
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    .line 688
    invoke-static {v10}, Lmh/b;->c(I)Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v10

    .line 692
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    const-string v10, " but was "

    .line 696
    .line 697
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 698
    .line 699
    .line 700
    invoke-static {v9}, Lmh/b;->c(I)Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v9

    .line 704
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v4

    .line 711
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 715
    :catchall_1
    move-exception v0

    .line 716
    goto :goto_a

    .line 717
    :goto_b
    :try_start_7
    invoke-virtual {v8}, Llh/b0;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 718
    .line 719
    .line 720
    goto :goto_c

    .line 721
    :catchall_2
    move-exception v0

    .line 722
    :try_start_8
    invoke-static {v4, v0}, Lub/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 723
    .line 724
    .line 725
    :goto_c
    move-object v0, v4

    .line 726
    :goto_d
    if-nez v0, :cond_12

    .line 727
    .line 728
    goto :goto_e

    .line 729
    :cond_12
    throw v0

    .line 730
    :catchall_3
    move-exception v0

    .line 731
    move-object v4, v0

    .line 732
    goto :goto_f

    .line 733
    :cond_13
    new-instance v4, Ljava/io/IOException;

    .line 734
    .line 735
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    throw v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 739
    :cond_14
    :goto_e
    :try_start_9
    invoke-virtual {v7}, Llh/b0;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 740
    .line 741
    .line 742
    const/4 v0, 0x0

    .line 743
    goto :goto_11

    .line 744
    :catchall_4
    move-exception v0

    .line 745
    goto :goto_11

    .line 746
    :goto_f
    :try_start_a
    invoke-virtual {v7}, Llh/b0;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 747
    .line 748
    .line 749
    goto :goto_10

    .line 750
    :catchall_5
    move-exception v0

    .line 751
    :try_start_b
    invoke-static {v4, v0}, Lub/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 752
    .line 753
    .line 754
    :goto_10
    move-object v0, v4

    .line 755
    :goto_11
    if-nez v0, :cond_16

    .line 756
    .line 757
    :cond_15
    move-object/from16 v0, v23

    .line 758
    .line 759
    goto :goto_12

    .line 760
    :cond_16
    throw v0

    .line 761
    :catchall_6
    move-exception v0

    .line 762
    move-object v2, v0

    .line 763
    goto/16 :goto_1a

    .line 764
    .line 765
    :goto_12
    new-instance v4, Ljava/util/ArrayList;

    .line 766
    .line 767
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 768
    .line 769
    .line 770
    iget-wide v7, v0, Lmh/f;->b:J

    .line 771
    .line 772
    invoke-virtual {v13, v7, v8}, Llh/t;->b(J)Llh/j;

    .line 773
    .line 774
    .line 775
    move-result-object v7

    .line 776
    invoke-static {v7}, Lg8/a;->l(Llh/h0;)Llh/b0;

    .line 777
    .line 778
    .line 779
    move-result-object v7
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 780
    :try_start_c
    iget-wide v8, v0, Lmh/f;->a:J

    .line 781
    .line 782
    :goto_13
    cmp-long v10, v21, v8

    .line 783
    .line 784
    if-gez v10, :cond_19

    .line 785
    .line 786
    invoke-static {v7}, Lmh/b;->d(Llh/b0;)Lmh/j;

    .line 787
    .line 788
    .line 789
    move-result-object v10

    .line 790
    iget-wide v11, v10, Lmh/j;->h:J

    .line 791
    .line 792
    iget-wide v14, v0, Lmh/f;->b:J

    .line 793
    .line 794
    cmp-long v23, v11, v14

    .line 795
    .line 796
    if-gez v23, :cond_18

    .line 797
    .line 798
    sget-object v11, Lmh/h;->e:Llh/y;

    .line 799
    .line 800
    iget-object v11, v10, Lmh/j;->a:Llh/y;

    .line 801
    .line 802
    invoke-static {v11}, Lm3/l;->n(Llh/y;)Z

    .line 803
    .line 804
    .line 805
    move-result v11

    .line 806
    if-eqz v11, :cond_17

    .line 807
    .line 808
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 809
    .line 810
    .line 811
    goto :goto_14

    .line 812
    :catchall_7
    move-exception v0

    .line 813
    move-object v8, v0

    .line 814
    goto :goto_15

    .line 815
    :cond_17
    :goto_14
    const-wide/16 v10, 0x1

    .line 816
    .line 817
    add-long v21, v21, v10

    .line 818
    .line 819
    goto :goto_13

    .line 820
    :cond_18
    new-instance v0, Ljava/io/IOException;

    .line 821
    .line 822
    const-string v8, "bad zip: local file header offset >= central directory offset"

    .line 823
    .line 824
    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 825
    .line 826
    .line 827
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 828
    :cond_19
    :try_start_d
    invoke-virtual {v7}, Llh/b0;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 829
    .line 830
    .line 831
    const/4 v0, 0x0

    .line 832
    goto :goto_17

    .line 833
    :catchall_8
    move-exception v0

    .line 834
    goto :goto_17

    .line 835
    :goto_15
    :try_start_e
    invoke-virtual {v7}, Llh/b0;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 836
    .line 837
    .line 838
    goto :goto_16

    .line 839
    :catchall_9
    move-exception v0

    .line 840
    :try_start_f
    invoke-static {v8, v0}, Lub/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 841
    .line 842
    .line 843
    :goto_16
    move-object v0, v8

    .line 844
    :goto_17
    if-nez v0, :cond_1b

    .line 845
    .line 846
    invoke-static {v4}, Lmh/b;->b(Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    new-instance v4, Llh/k0;

    .line 851
    .line 852
    invoke-direct {v4, v6, v3, v0}, Llh/k0;-><init>(Llh/y;Llh/l;Ljava/util/LinkedHashMap;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 853
    .line 854
    .line 855
    :try_start_10
    invoke-virtual {v13}, Llh/t;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    .line 856
    .line 857
    .line 858
    :catchall_a
    sget-object v0, Lmh/h;->e:Llh/y;

    .line 859
    .line 860
    new-instance v6, Lub/k;

    .line 861
    .line 862
    invoke-direct {v6, v4, v0}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 863
    .line 864
    .line 865
    move-object v8, v6

    .line 866
    :goto_18
    if-eqz v8, :cond_1a

    .line 867
    .line 868
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 869
    .line 870
    .line 871
    :cond_1a
    move-object/from16 v11, v20

    .line 872
    .line 873
    const/4 v4, -0x1

    .line 874
    const/4 v7, 0x4

    .line 875
    const/4 v10, 0x0

    .line 876
    goto/16 :goto_6

    .line 877
    .line 878
    :cond_1b
    :try_start_11
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    .line 879
    :catchall_b
    move-exception v0

    .line 880
    goto :goto_19

    .line 881
    :cond_1c
    :try_start_12
    new-instance v2, Ljava/io/IOException;

    .line 882
    .line 883
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    throw v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_b

    .line 887
    :cond_1d
    :try_start_13
    invoke-virtual {v12}, Llh/b0;->close()V

    .line 888
    .line 889
    .line 890
    const-wide/16 v7, -0x1

    .line 891
    .line 892
    add-long/2addr v14, v7

    .line 893
    cmp-long v4, v14, v10

    .line 894
    .line 895
    if-ltz v4, :cond_1e

    .line 896
    .line 897
    move-wide/from16 v7, v21

    .line 898
    .line 899
    goto/16 :goto_8

    .line 900
    .line 901
    :cond_1e
    new-instance v0, Ljava/io/IOException;

    .line 902
    .line 903
    const-string v2, "not a zip: end of central directory signature not found"

    .line 904
    .line 905
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    throw v0

    .line 909
    :goto_19
    invoke-virtual {v12}, Llh/b0;->close()V

    .line 910
    .line 911
    .line 912
    throw v0

    .line 913
    :cond_1f
    new-instance v0, Ljava/io/IOException;

    .line 914
    .line 915
    new-instance v2, Ljava/lang/StringBuilder;

    .line 916
    .line 917
    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 918
    .line 919
    .line 920
    invoke-virtual {v13}, Llh/t;->size()J

    .line 921
    .line 922
    .line 923
    move-result-wide v3

    .line 924
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 925
    .line 926
    .line 927
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v2

    .line 931
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 932
    .line 933
    .line 934
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 935
    :goto_1a
    if-eqz v13, :cond_20

    .line 936
    .line 937
    :try_start_14
    invoke-virtual {v13}, Llh/t;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    .line 938
    .line 939
    .line 940
    goto :goto_1b

    .line 941
    :catchall_c
    move-exception v0

    .line 942
    invoke-static {v2, v0}, Lub/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 943
    .line 944
    .line 945
    :cond_20
    :goto_1b
    throw v2

    .line 946
    :cond_21
    move-object v3, v11

    .line 947
    invoke-static {v3, v2}, Lvb/m;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    return-object v0

    .line 952
    :pswitch_8
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 953
    .line 954
    check-cast v0, Lm0/c2;

    .line 955
    .line 956
    iget-object v0, v0, Lm0/c2;->i:Lx0/e1;

    .line 957
    .line 958
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    check-cast v0, Ljava/util/Map;

    .line 963
    .line 964
    return-object v0

    .line 965
    :pswitch_9
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 966
    .line 967
    check-cast v0, Lm0/g3;

    .line 968
    .line 969
    iget-object v2, v0, Lm0/g3;->a:Ljava/lang/Object;

    .line 970
    .line 971
    const/4 v3, 0x0

    .line 972
    invoke-static {v3, v2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 973
    .line 974
    .line 975
    move-result v2

    .line 976
    if-nez v2, :cond_22

    .line 977
    .line 978
    iget-object v2, v0, Lm0/g3;->b:Ljava/util/ArrayList;

    .line 979
    .line 980
    new-instance v3, Lm0/l3;

    .line 981
    .line 982
    invoke-direct {v3, v6}, Lm0/l3;-><init>(I)V

    .line 983
    .line 984
    .line 985
    invoke-static {v2, v3}, Lvb/m;->s0(Ljava/util/List;Lic/k;)V

    .line 986
    .line 987
    .line 988
    iget-object v0, v0, Lm0/g3;->c:Lx0/p1;

    .line 989
    .line 990
    if-eqz v0, :cond_22

    .line 991
    .line 992
    invoke-virtual {v0}, Lx0/p1;->c()V

    .line 993
    .line 994
    .line 995
    :cond_22
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 996
    .line 997
    return-object v0

    .line 998
    :pswitch_a
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 999
    .line 1000
    check-cast v0, Lf3/c;

    .line 1001
    .line 1002
    sget v2, Landroidx/compose/material/a;->b:F

    .line 1003
    .line 1004
    invoke-interface {v0, v2}, Lf3/c;->Q(F)F

    .line 1005
    .line 1006
    .line 1007
    move-result v0

    .line 1008
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v0

    .line 1012
    return-object v0

    .line 1013
    :pswitch_b
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 1014
    .line 1015
    check-cast v0, Lm0/t2;

    .line 1016
    .line 1017
    invoke-virtual {v0}, Lm0/t2;->b()Lf3/c;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    sget v2, Lm0/s2;->c:F

    .line 1022
    .line 1023
    invoke-interface {v0, v2}, Lf3/c;->Q(F)F

    .line 1024
    .line 1025
    .line 1026
    move-result v0

    .line 1027
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    return-object v0

    .line 1032
    :pswitch_c
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 1033
    .line 1034
    check-cast v0, Landroid/view/View;

    .line 1035
    .line 1036
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    :goto_1c
    if-eqz v0, :cond_24

    .line 1041
    .line 1042
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 1043
    .line 1044
    if-eqz v2, :cond_24

    .line 1045
    .line 1046
    check-cast v0, Landroid/view/ViewGroup;

    .line 1047
    .line 1048
    invoke-virtual {v0}, Landroid/view/ViewGroup;->shouldDelayChildPressedState()Z

    .line 1049
    .line 1050
    .line 1051
    move-result v2

    .line 1052
    if-eqz v2, :cond_23

    .line 1053
    .line 1054
    const/4 v9, 0x1

    .line 1055
    goto :goto_1d

    .line 1056
    :cond_23
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    goto :goto_1c

    .line 1061
    :cond_24
    const/4 v9, 0x0

    .line 1062
    :goto_1d
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    return-object v0

    .line 1067
    :pswitch_d
    const-string v0, "Orientation"

    .line 1068
    .line 1069
    iget-object v3, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 1070
    .line 1071
    check-cast v3, Lj8/e;

    .line 1072
    .line 1073
    new-instance v7, Landroid/graphics/BitmapFactory$Options;

    .line 1074
    .line 1075
    invoke-direct {v7}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 1076
    .line 1077
    .line 1078
    iget-object v8, v3, Lj8/e;->b:Ls8/m;

    .line 1079
    .line 1080
    new-instance v9, Lj8/b;

    .line 1081
    .line 1082
    iget-object v10, v3, Lj8/e;->a:Lj8/n;

    .line 1083
    .line 1084
    invoke-virtual {v10}, Lj8/n;->g()Llh/h;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v4

    .line 1088
    invoke-direct {v9, v4}, Lj8/b;-><init>(Llh/h0;)V

    .line 1089
    .line 1090
    .line 1091
    invoke-static {v9}, Lg8/a;->l(Llh/h0;)Llh/b0;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v11

    .line 1095
    const/4 v12, 0x1

    .line 1096
    iput-boolean v12, v7, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1097
    .line 1098
    new-instance v4, Llh/z;

    .line 1099
    .line 1100
    invoke-direct {v4, v11}, Llh/z;-><init>(Llh/h;)V

    .line 1101
    .line 1102
    .line 1103
    invoke-static {v4}, Lg8/a;->l(Llh/h0;)Llh/b0;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v4

    .line 1107
    new-instance v13, Llh/e;

    .line 1108
    .line 1109
    invoke-direct {v13, v4, v12}, Llh/e;-><init>(Llh/h;I)V

    .line 1110
    .line 1111
    .line 1112
    const/4 v4, 0x0

    .line 1113
    invoke-static {v13, v4, v7}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 1114
    .line 1115
    .line 1116
    iget-object v4, v9, Lj8/b;->c:Ljava/lang/Object;

    .line 1117
    .line 1118
    check-cast v4, Ljava/lang/Exception;

    .line 1119
    .line 1120
    if-nez v4, :cond_51

    .line 1121
    .line 1122
    const/4 v12, 0x0

    .line 1123
    iput-boolean v12, v7, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1124
    .line 1125
    sget-object v12, Lj8/k;->a:Landroid/graphics/Paint;

    .line 1126
    .line 1127
    iget-object v12, v7, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 1128
    .line 1129
    iget-object v3, v3, Lj8/e;->d:Lj8/j;

    .line 1130
    .line 1131
    sget-object v13, Lj8/l;->a:Ljava/util/Set;

    .line 1132
    .line 1133
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1134
    .line 1135
    .line 1136
    move-result v3

    .line 1137
    const/16 v14, 0x5a

    .line 1138
    .line 1139
    if-eqz v3, :cond_2a

    .line 1140
    .line 1141
    const/4 v15, 0x1

    .line 1142
    if-eq v3, v15, :cond_26

    .line 1143
    .line 1144
    if-ne v3, v5, :cond_25

    .line 1145
    .line 1146
    goto :goto_1e

    .line 1147
    :cond_25
    new-instance v0, Lce/j0;

    .line 1148
    .line 1149
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 1150
    .line 1151
    .line 1152
    throw v0

    .line 1153
    :cond_26
    if-eqz v12, :cond_2a

    .line 1154
    .line 1155
    sget-object v3, Lj8/l;->a:Ljava/util/Set;

    .line 1156
    .line 1157
    invoke-interface {v3, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v3

    .line 1161
    if-eqz v3, :cond_2a

    .line 1162
    .line 1163
    :goto_1e
    new-instance v3, Le4/g;

    .line 1164
    .line 1165
    new-instance v12, Lj8/i;

    .line 1166
    .line 1167
    new-instance v15, Llh/z;

    .line 1168
    .line 1169
    invoke-direct {v15, v11}, Llh/z;-><init>(Llh/h;)V

    .line 1170
    .line 1171
    .line 1172
    invoke-static {v15}, Lg8/a;->l(Llh/h0;)Llh/b0;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v15

    .line 1176
    new-instance v4, Llh/e;

    .line 1177
    .line 1178
    const/4 v13, 0x1

    .line 1179
    invoke-direct {v4, v15, v13}, Llh/e;-><init>(Llh/h;I)V

    .line 1180
    .line 1181
    .line 1182
    invoke-direct {v12, v4}, Lj8/i;-><init>(Ljava/io/InputStream;)V

    .line 1183
    .line 1184
    .line 1185
    invoke-direct {v3, v12}, Le4/g;-><init>(Ljava/io/InputStream;)V

    .line 1186
    .line 1187
    .line 1188
    new-instance v4, Lj8/h;

    .line 1189
    .line 1190
    invoke-virtual {v3, v0}, Le4/g;->c(Ljava/lang/String;)Le4/c;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v12

    .line 1194
    if-nez v12, :cond_27

    .line 1195
    .line 1196
    goto :goto_1f

    .line 1197
    :cond_27
    :try_start_15
    iget-object v13, v3, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 1198
    .line 1199
    invoke-virtual {v12, v13}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 1200
    .line 1201
    .line 1202
    move-result v12
    :try_end_15
    .catch Ljava/lang/NumberFormatException; {:try_start_15 .. :try_end_15} :catch_0

    .line 1203
    goto :goto_20

    .line 1204
    :catch_0
    nop

    .line 1205
    :goto_1f
    const/4 v12, 0x1

    .line 1206
    :goto_20
    if-eq v12, v5, :cond_28

    .line 1207
    .line 1208
    if-eq v12, v2, :cond_28

    .line 1209
    .line 1210
    const/4 v2, 0x4

    .line 1211
    if-eq v12, v2, :cond_28

    .line 1212
    .line 1213
    if-eq v12, v6, :cond_28

    .line 1214
    .line 1215
    const/4 v2, 0x0

    .line 1216
    goto :goto_21

    .line 1217
    :cond_28
    const/4 v2, 0x1

    .line 1218
    :goto_21
    invoke-virtual {v3, v0}, Le4/g;->c(Ljava/lang/String;)Le4/c;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v0

    .line 1222
    if-nez v0, :cond_29

    .line 1223
    .line 1224
    goto :goto_22

    .line 1225
    :cond_29
    :try_start_16
    iget-object v3, v3, Le4/g;->f:Ljava/nio/ByteOrder;

    .line 1226
    .line 1227
    invoke-virtual {v0, v3}, Le4/c;->e(Ljava/nio/ByteOrder;)I

    .line 1228
    .line 1229
    .line 1230
    move-result v0
    :try_end_16
    .catch Ljava/lang/NumberFormatException; {:try_start_16 .. :try_end_16} :catch_1

    .line 1231
    goto :goto_23

    .line 1232
    :catch_1
    nop

    .line 1233
    :goto_22
    const/4 v0, 0x1

    .line 1234
    :goto_23
    packed-switch v0, :pswitch_data_1

    .line 1235
    .line 1236
    .line 1237
    const/4 v0, 0x0

    .line 1238
    goto :goto_24

    .line 1239
    :pswitch_e
    const/16 v0, 0x5a

    .line 1240
    .line 1241
    goto :goto_24

    .line 1242
    :pswitch_f
    const/16 v0, 0x10e

    .line 1243
    .line 1244
    goto :goto_24

    .line 1245
    :pswitch_10
    const/16 v0, 0xb4

    .line 1246
    .line 1247
    :goto_24
    invoke-direct {v4, v0, v2}, Lj8/h;-><init>(IZ)V

    .line 1248
    .line 1249
    .line 1250
    goto :goto_25

    .line 1251
    :cond_2a
    sget-object v4, Lj8/h;->c:Lj8/h;

    .line 1252
    .line 1253
    :goto_25
    iget v0, v4, Lj8/h;->b:I

    .line 1254
    .line 1255
    iget-boolean v2, v4, Lj8/h;->a:Z

    .line 1256
    .line 1257
    iget-object v3, v9, Lj8/b;->c:Ljava/lang/Object;

    .line 1258
    .line 1259
    check-cast v3, Ljava/lang/Exception;

    .line 1260
    .line 1261
    if-nez v3, :cond_50

    .line 1262
    .line 1263
    const/4 v4, 0x0

    .line 1264
    iput-boolean v4, v7, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 1265
    .line 1266
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1267
    .line 1268
    const/16 v5, 0x1a

    .line 1269
    .line 1270
    if-lt v3, v5, :cond_2b

    .line 1271
    .line 1272
    iget-object v6, v8, Ls8/m;->c:Landroid/graphics/ColorSpace;

    .line 1273
    .line 1274
    if-eqz v6, :cond_2b

    .line 1275
    .line 1276
    invoke-static {v7, v6}, Lb7/l;->q(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    .line 1277
    .line 1278
    .line 1279
    :cond_2b
    iget-boolean v6, v8, Ls8/m;->h:Z

    .line 1280
    .line 1281
    iget-object v12, v8, Ls8/m;->a:Landroid/content/Context;

    .line 1282
    .line 1283
    iget-object v13, v8, Ls8/m;->d:Lt8/h;

    .line 1284
    .line 1285
    iput-boolean v6, v7, Landroid/graphics/BitmapFactory$Options;->inPremultiplied:Z

    .line 1286
    .line 1287
    iget-object v6, v8, Ls8/m;->b:Landroid/graphics/Bitmap$Config;

    .line 1288
    .line 1289
    if-nez v2, :cond_2c

    .line 1290
    .line 1291
    if-lez v0, :cond_2e

    .line 1292
    .line 1293
    :cond_2c
    if-eqz v6, :cond_2d

    .line 1294
    .line 1295
    invoke-static {v6}, Lud/n;->t(Landroid/graphics/Bitmap$Config;)Z

    .line 1296
    .line 1297
    .line 1298
    move-result v15

    .line 1299
    if-eqz v15, :cond_2e

    .line 1300
    .line 1301
    :cond_2d
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1302
    .line 1303
    :cond_2e
    iget-boolean v15, v8, Ls8/m;->g:Z

    .line 1304
    .line 1305
    if-eqz v15, :cond_2f

    .line 1306
    .line 1307
    sget-object v15, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1308
    .line 1309
    if-ne v6, v15, :cond_2f

    .line 1310
    .line 1311
    iget-object v15, v7, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 1312
    .line 1313
    const-string v4, "image/jpeg"

    .line 1314
    .line 1315
    invoke-static {v15, v4}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1316
    .line 1317
    .line 1318
    move-result v4

    .line 1319
    if-eqz v4, :cond_2f

    .line 1320
    .line 1321
    sget-object v6, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 1322
    .line 1323
    :cond_2f
    if-lt v3, v5, :cond_30

    .line 1324
    .line 1325
    invoke-static {v7}, Lb7/l;->f(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap$Config;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v3

    .line 1329
    invoke-static {}, Lp4/q;->d()Landroid/graphics/Bitmap$Config;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v4

    .line 1333
    if-ne v3, v4, :cond_30

    .line 1334
    .line 1335
    invoke-static {}, Lp4/q;->q()Landroid/graphics/Bitmap$Config;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v3

    .line 1339
    if-eq v6, v3, :cond_30

    .line 1340
    .line 1341
    invoke-static {}, Lp4/q;->d()Landroid/graphics/Bitmap$Config;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v6

    .line 1345
    :cond_30
    iput-object v6, v7, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 1346
    .line 1347
    invoke-virtual {v10}, Lj8/n;->b()Llc/b;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v3

    .line 1351
    instance-of v4, v3, Lj8/o;

    .line 1352
    .line 1353
    if-eqz v4, :cond_32

    .line 1354
    .line 1355
    sget-object v4, Lt8/h;->c:Lt8/h;

    .line 1356
    .line 1357
    invoke-static {v13, v4}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1358
    .line 1359
    .line 1360
    move-result v4

    .line 1361
    if-eqz v4, :cond_32

    .line 1362
    .line 1363
    const/4 v15, 0x1

    .line 1364
    iput v15, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1365
    .line 1366
    iput-boolean v15, v7, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 1367
    .line 1368
    check-cast v3, Lj8/o;

    .line 1369
    .line 1370
    iget v3, v3, Lj8/o;->b:I

    .line 1371
    .line 1372
    iput v3, v7, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1373
    .line 1374
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v3

    .line 1378
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v3

    .line 1382
    iget v3, v3, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 1383
    .line 1384
    iput v3, v7, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 1385
    .line 1386
    move/from16 v20, v2

    .line 1387
    .line 1388
    move-object v6, v12

    .line 1389
    :cond_31
    :goto_26
    const/4 v15, 0x1

    .line 1390
    goto/16 :goto_30

    .line 1391
    .line 1392
    :cond_32
    iget v3, v7, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 1393
    .line 1394
    if-lez v3, :cond_33

    .line 1395
    .line 1396
    iget v4, v7, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 1397
    .line 1398
    if-gtz v4, :cond_34

    .line 1399
    .line 1400
    :cond_33
    move/from16 v20, v2

    .line 1401
    .line 1402
    move-object v6, v12

    .line 1403
    const/4 v15, 0x1

    .line 1404
    goto/16 :goto_2f

    .line 1405
    .line 1406
    :cond_34
    const/16 v5, 0x10e

    .line 1407
    .line 1408
    if-eq v0, v14, :cond_36

    .line 1409
    .line 1410
    if-ne v0, v5, :cond_35

    .line 1411
    .line 1412
    goto :goto_27

    .line 1413
    :cond_35
    move v6, v3

    .line 1414
    goto :goto_28

    .line 1415
    :cond_36
    :goto_27
    move v6, v4

    .line 1416
    :goto_28
    if-eq v0, v14, :cond_38

    .line 1417
    .line 1418
    if-ne v0, v5, :cond_37

    .line 1419
    .line 1420
    goto :goto_29

    .line 1421
    :cond_37
    move v3, v4

    .line 1422
    :cond_38
    :goto_29
    iget-object v4, v8, Ls8/m;->e:Lt8/g;

    .line 1423
    .line 1424
    sget-object v5, Lt8/h;->c:Lt8/h;

    .line 1425
    .line 1426
    invoke-static {v13, v5}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1427
    .line 1428
    .line 1429
    move-result v10

    .line 1430
    if-eqz v10, :cond_39

    .line 1431
    .line 1432
    move v10, v6

    .line 1433
    goto :goto_2a

    .line 1434
    :cond_39
    iget-object v10, v13, Lt8/h;->a:Lnh/a;

    .line 1435
    .line 1436
    invoke-static {v10, v4}, Lx8/d;->d(Lnh/a;Lt8/g;)I

    .line 1437
    .line 1438
    .line 1439
    move-result v10

    .line 1440
    :goto_2a
    invoke-static {v13, v5}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1441
    .line 1442
    .line 1443
    move-result v5

    .line 1444
    if-eqz v5, :cond_3a

    .line 1445
    .line 1446
    move v5, v3

    .line 1447
    goto :goto_2b

    .line 1448
    :cond_3a
    iget-object v5, v13, Lt8/h;->b:Lnh/a;

    .line 1449
    .line 1450
    invoke-static {v5, v4}, Lx8/d;->d(Lnh/a;Lt8/g;)I

    .line 1451
    .line 1452
    .line 1453
    move-result v5

    .line 1454
    :goto_2b
    div-int v13, v6, v10

    .line 1455
    .line 1456
    invoke-static {v13}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 1457
    .line 1458
    .line 1459
    move-result v13

    .line 1460
    div-int v15, v3, v5

    .line 1461
    .line 1462
    invoke-static {v15}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 1463
    .line 1464
    .line 1465
    move-result v15

    .line 1466
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 1467
    .line 1468
    .line 1469
    move-result v14

    .line 1470
    if-eqz v14, :cond_3c

    .line 1471
    .line 1472
    move/from16 v20, v2

    .line 1473
    .line 1474
    const/4 v2, 0x1

    .line 1475
    if-ne v14, v2, :cond_3b

    .line 1476
    .line 1477
    invoke-static {v13, v15}, Ljava/lang/Math;->max(II)I

    .line 1478
    .line 1479
    .line 1480
    move-result v13

    .line 1481
    goto :goto_2c

    .line 1482
    :cond_3b
    new-instance v0, Lce/j0;

    .line 1483
    .line 1484
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 1485
    .line 1486
    .line 1487
    throw v0

    .line 1488
    :cond_3c
    move/from16 v20, v2

    .line 1489
    .line 1490
    const/4 v2, 0x1

    .line 1491
    invoke-static {v13, v15}, Ljava/lang/Math;->min(II)I

    .line 1492
    .line 1493
    .line 1494
    move-result v13

    .line 1495
    :goto_2c
    if-ge v13, v2, :cond_3d

    .line 1496
    .line 1497
    const/4 v13, 0x1

    .line 1498
    :cond_3d
    iput v13, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1499
    .line 1500
    int-to-double v14, v6

    .line 1501
    move-object v2, v12

    .line 1502
    int-to-double v12, v13

    .line 1503
    div-double/2addr v14, v12

    .line 1504
    move-object v6, v2

    .line 1505
    int-to-double v2, v3

    .line 1506
    div-double/2addr v2, v12

    .line 1507
    int-to-double v12, v10

    .line 1508
    move-wide/from16 v21, v2

    .line 1509
    .line 1510
    int-to-double v2, v5

    .line 1511
    div-double/2addr v12, v14

    .line 1512
    div-double v2, v2, v21

    .line 1513
    .line 1514
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 1515
    .line 1516
    .line 1517
    move-result v4

    .line 1518
    if-eqz v4, :cond_3f

    .line 1519
    .line 1520
    const/4 v15, 0x1

    .line 1521
    if-ne v4, v15, :cond_3e

    .line 1522
    .line 1523
    invoke-static {v12, v13, v2, v3}, Ljava/lang/Math;->min(DD)D

    .line 1524
    .line 1525
    .line 1526
    move-result-wide v2

    .line 1527
    goto :goto_2d

    .line 1528
    :cond_3e
    new-instance v0, Lce/j0;

    .line 1529
    .line 1530
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 1531
    .line 1532
    .line 1533
    throw v0

    .line 1534
    :cond_3f
    invoke-static {v12, v13, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 1535
    .line 1536
    .line 1537
    move-result-wide v2

    .line 1538
    :goto_2d
    iget-boolean v4, v8, Ls8/m;->f:Z

    .line 1539
    .line 1540
    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    .line 1541
    .line 1542
    if-eqz v4, :cond_40

    .line 1543
    .line 1544
    cmpl-double v4, v2, v12

    .line 1545
    .line 1546
    if-lez v4, :cond_40

    .line 1547
    .line 1548
    move-wide v2, v12

    .line 1549
    :cond_40
    cmpg-double v4, v2, v12

    .line 1550
    .line 1551
    if-nez v4, :cond_41

    .line 1552
    .line 1553
    const/4 v4, 0x1

    .line 1554
    goto :goto_2e

    .line 1555
    :cond_41
    const/4 v4, 0x0

    .line 1556
    :goto_2e
    xor-int/lit8 v5, v4, 0x1

    .line 1557
    .line 1558
    iput-boolean v5, v7, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 1559
    .line 1560
    if-nez v4, :cond_31

    .line 1561
    .line 1562
    const v4, 0x7fffffff

    .line 1563
    .line 1564
    .line 1565
    cmpl-double v5, v2, v12

    .line 1566
    .line 1567
    if-lez v5, :cond_42

    .line 1568
    .line 1569
    int-to-double v12, v4

    .line 1570
    div-double/2addr v12, v2

    .line 1571
    invoke-static {v12, v13}, Llc/b;->Q(D)I

    .line 1572
    .line 1573
    .line 1574
    move-result v2

    .line 1575
    iput v2, v7, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1576
    .line 1577
    iput v4, v7, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 1578
    .line 1579
    goto/16 :goto_26

    .line 1580
    .line 1581
    :cond_42
    iput v4, v7, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1582
    .line 1583
    int-to-double v4, v4

    .line 1584
    mul-double v4, v4, v2

    .line 1585
    .line 1586
    invoke-static {v4, v5}, Llc/b;->Q(D)I

    .line 1587
    .line 1588
    .line 1589
    move-result v2

    .line 1590
    iput v2, v7, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 1591
    .line 1592
    goto/16 :goto_26

    .line 1593
    .line 1594
    :goto_2f
    iput v15, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1595
    .line 1596
    const/4 v4, 0x0

    .line 1597
    iput-boolean v4, v7, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 1598
    .line 1599
    :goto_30
    :try_start_17
    new-instance v2, Llh/e;

    .line 1600
    .line 1601
    invoke-direct {v2, v11, v15}, Llh/e;-><init>(Llh/h;I)V

    .line 1602
    .line 1603
    .line 1604
    const/4 v3, 0x0

    .line 1605
    invoke-static {v2, v3, v7}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_d

    .line 1609
    invoke-virtual {v11}, Llh/b0;->close()V

    .line 1610
    .line 1611
    .line 1612
    iget-object v3, v9, Lj8/b;->c:Ljava/lang/Object;

    .line 1613
    .line 1614
    check-cast v3, Ljava/lang/Exception;

    .line 1615
    .line 1616
    if-nez v3, :cond_4f

    .line 1617
    .line 1618
    if-eqz v2, :cond_4e

    .line 1619
    .line 1620
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v3

    .line 1624
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v3

    .line 1628
    iget v3, v3, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 1629
    .line 1630
    invoke-virtual {v2, v3}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 1631
    .line 1632
    .line 1633
    if-nez v20, :cond_43

    .line 1634
    .line 1635
    if-lez v0, :cond_4b

    .line 1636
    .line 1637
    :cond_43
    new-instance v3, Landroid/graphics/Matrix;

    .line 1638
    .line 1639
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 1640
    .line 1641
    .line 1642
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1643
    .line 1644
    .line 1645
    move-result v5

    .line 1646
    int-to-float v5, v5

    .line 1647
    const/high16 v8, 0x40000000    # 2.0f

    .line 1648
    .line 1649
    div-float/2addr v5, v8

    .line 1650
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1651
    .line 1652
    .line 1653
    move-result v9

    .line 1654
    int-to-float v9, v9

    .line 1655
    div-float/2addr v9, v8

    .line 1656
    if-eqz v20, :cond_44

    .line 1657
    .line 1658
    const/high16 v8, -0x40800000    # -1.0f

    .line 1659
    .line 1660
    const/high16 v10, 0x3f800000    # 1.0f

    .line 1661
    .line 1662
    invoke-virtual {v3, v8, v10, v5, v9}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 1663
    .line 1664
    .line 1665
    :cond_44
    if-lez v0, :cond_45

    .line 1666
    .line 1667
    int-to-float v8, v0

    .line 1668
    invoke-virtual {v3, v8, v5, v9}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 1669
    .line 1670
    .line 1671
    :cond_45
    new-instance v5, Landroid/graphics/RectF;

    .line 1672
    .line 1673
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1674
    .line 1675
    .line 1676
    move-result v8

    .line 1677
    int-to-float v8, v8

    .line 1678
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1679
    .line 1680
    .line 1681
    move-result v9

    .line 1682
    int-to-float v9, v9

    .line 1683
    const/4 v10, 0x0

    .line 1684
    invoke-direct {v5, v10, v10, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1685
    .line 1686
    .line 1687
    invoke-virtual {v3, v5}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 1688
    .line 1689
    .line 1690
    iget v8, v5, Landroid/graphics/RectF;->left:F

    .line 1691
    .line 1692
    cmpg-float v9, v8, v10

    .line 1693
    .line 1694
    if-nez v9, :cond_46

    .line 1695
    .line 1696
    iget v9, v5, Landroid/graphics/RectF;->top:F

    .line 1697
    .line 1698
    cmpg-float v9, v9, v10

    .line 1699
    .line 1700
    if-nez v9, :cond_46

    .line 1701
    .line 1702
    :goto_31
    const/16 v5, 0x5a

    .line 1703
    .line 1704
    goto :goto_32

    .line 1705
    :cond_46
    neg-float v8, v8

    .line 1706
    iget v5, v5, Landroid/graphics/RectF;->top:F

    .line 1707
    .line 1708
    neg-float v5, v5

    .line 1709
    invoke-virtual {v3, v8, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1710
    .line 1711
    .line 1712
    goto :goto_31

    .line 1713
    :goto_32
    if-eq v0, v5, :cond_49

    .line 1714
    .line 1715
    const/16 v5, 0x10e

    .line 1716
    .line 1717
    if-ne v0, v5, :cond_47

    .line 1718
    .line 1719
    goto :goto_33

    .line 1720
    :cond_47
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1721
    .line 1722
    .line 1723
    move-result v0

    .line 1724
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1725
    .line 1726
    .line 1727
    move-result v5

    .line 1728
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v8

    .line 1732
    if-nez v8, :cond_48

    .line 1733
    .line 1734
    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1735
    .line 1736
    :cond_48
    invoke-static {v0, v5, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v0

    .line 1740
    goto :goto_34

    .line 1741
    :cond_49
    :goto_33
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1742
    .line 1743
    .line 1744
    move-result v0

    .line 1745
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1746
    .line 1747
    .line 1748
    move-result v5

    .line 1749
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v8

    .line 1753
    if-nez v8, :cond_4a

    .line 1754
    .line 1755
    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1756
    .line 1757
    :cond_4a
    invoke-static {v0, v5, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v0

    .line 1761
    :goto_34
    new-instance v5, Landroid/graphics/Canvas;

    .line 1762
    .line 1763
    invoke-direct {v5, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1764
    .line 1765
    .line 1766
    sget-object v8, Lj8/k;->a:Landroid/graphics/Paint;

    .line 1767
    .line 1768
    invoke-virtual {v5, v2, v3, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 1769
    .line 1770
    .line 1771
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 1772
    .line 1773
    .line 1774
    move-object v2, v0

    .line 1775
    :cond_4b
    new-instance v0, Lj8/g;

    .line 1776
    .line 1777
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1778
    .line 1779
    .line 1780
    move-result-object v3

    .line 1781
    new-instance v5, Landroid/graphics/drawable/BitmapDrawable;

    .line 1782
    .line 1783
    invoke-direct {v5, v3, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 1784
    .line 1785
    .line 1786
    iget v2, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1787
    .line 1788
    const/4 v15, 0x1

    .line 1789
    if-gt v2, v15, :cond_4d

    .line 1790
    .line 1791
    iget-boolean v2, v7, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 1792
    .line 1793
    if-eqz v2, :cond_4c

    .line 1794
    .line 1795
    goto :goto_35

    .line 1796
    :cond_4c
    const/4 v9, 0x0

    .line 1797
    goto :goto_36

    .line 1798
    :cond_4d
    :goto_35
    const/4 v9, 0x1

    .line 1799
    :goto_36
    invoke-direct {v0, v5, v9}, Lj8/g;-><init>(Landroid/graphics/drawable/BitmapDrawable;Z)V

    .line 1800
    .line 1801
    .line 1802
    return-object v0

    .line 1803
    :cond_4e
    const-string v0, "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format."

    .line 1804
    .line 1805
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 1806
    .line 1807
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1808
    .line 1809
    .line 1810
    throw v2

    .line 1811
    :cond_4f
    throw v3

    .line 1812
    :catchall_d
    move-exception v0

    .line 1813
    move-object v2, v0

    .line 1814
    :try_start_18
    throw v2
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_e

    .line 1815
    :catchall_e
    move-exception v0

    .line 1816
    invoke-static {v11, v2}, La/a;->w(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1817
    .line 1818
    .line 1819
    throw v0

    .line 1820
    :cond_50
    throw v3

    .line 1821
    :cond_51
    throw v4

    .line 1822
    :pswitch_11
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 1823
    .line 1824
    check-cast v0, Li8/l;

    .line 1825
    .line 1826
    iget-object v0, v0, Li8/l;->s:Lx0/e1;

    .line 1827
    .line 1828
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v0

    .line 1832
    check-cast v0, Ls8/i;

    .line 1833
    .line 1834
    return-object v0

    .line 1835
    :pswitch_12
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 1836
    .line 1837
    check-cast v0, Ljava/lang/String;

    .line 1838
    .line 1839
    new-instance v2, Le7/r;

    .line 1840
    .line 1841
    invoke-direct {v2, v0}, Le7/r;-><init>(Ljava/lang/String;)V

    .line 1842
    .line 1843
    .line 1844
    return-object v2

    .line 1845
    :pswitch_13
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 1846
    .line 1847
    move-object v6, v0

    .line 1848
    check-cast v6, Lh1/y;

    .line 1849
    .line 1850
    :goto_37
    iget-object v7, v6, Lh1/y;->g:Ljava/lang/Object;

    .line 1851
    .line 1852
    monitor-enter v7

    .line 1853
    :try_start_19
    iget-boolean v0, v6, Lh1/y;->c:Z

    .line 1854
    .line 1855
    if-nez v0, :cond_58

    .line 1856
    .line 1857
    const/4 v15, 0x1

    .line 1858
    iput-boolean v15, v6, Lh1/y;->c:Z
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_10

    .line 1859
    .line 1860
    :try_start_1a
    iget-object v0, v6, Lh1/y;->f:Lz0/e;

    .line 1861
    .line 1862
    iget-object v8, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 1863
    .line 1864
    iget v0, v0, Lz0/e;->c:I

    .line 1865
    .line 1866
    const/4 v9, 0x0

    .line 1867
    :goto_38
    if-ge v9, v0, :cond_57

    .line 1868
    .line 1869
    aget-object v10, v8, v9

    .line 1870
    .line 1871
    check-cast v10, Lh1/x;

    .line 1872
    .line 1873
    iget-object v11, v10, Lh1/x;->g:Lo/l0;

    .line 1874
    .line 1875
    iget-object v10, v10, Lh1/x;->a:Lic/k;

    .line 1876
    .line 1877
    iget-object v12, v11, Lo/l0;->b:[Ljava/lang/Object;

    .line 1878
    .line 1879
    iget-object v13, v11, Lo/l0;->a:[J

    .line 1880
    .line 1881
    array-length v14, v13

    .line 1882
    sub-int/2addr v14, v5

    .line 1883
    if-ltz v14, :cond_55

    .line 1884
    .line 1885
    const/4 v15, 0x0

    .line 1886
    const/16 v16, 0x1f

    .line 1887
    .line 1888
    const/16 v17, 0x7

    .line 1889
    .line 1890
    :goto_39
    aget-wide v2, v13, v15

    .line 1891
    .line 1892
    not-long v4, v2

    .line 1893
    shl-long v4, v4, v17

    .line 1894
    .line 1895
    and-long/2addr v4, v2

    .line 1896
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    and-long v4, v4, v20

    .line 1902
    .line 1903
    cmp-long v22, v4, v20

    .line 1904
    .line 1905
    if-eqz v22, :cond_54

    .line 1906
    .line 1907
    sub-int v4, v15, v14

    .line 1908
    .line 1909
    not-int v4, v4

    .line 1910
    ushr-int/lit8 v4, v4, 0x1f

    .line 1911
    .line 1912
    const/16 v5, 0x8

    .line 1913
    .line 1914
    rsub-int/lit8 v4, v4, 0x8

    .line 1915
    .line 1916
    const/4 v5, 0x0

    .line 1917
    const/16 v20, 0x8

    .line 1918
    .line 1919
    :goto_3a
    if-ge v5, v4, :cond_53

    .line 1920
    .line 1921
    const-wide/16 v21, 0xff

    .line 1922
    .line 1923
    and-long v21, v2, v21

    .line 1924
    .line 1925
    const-wide/16 v23, 0x80

    .line 1926
    .line 1927
    cmp-long v25, v21, v23

    .line 1928
    .line 1929
    if-gez v25, :cond_52

    .line 1930
    .line 1931
    shl-int/lit8 v21, v15, 0x3

    .line 1932
    .line 1933
    add-int v21, v21, v5

    .line 1934
    .line 1935
    move/from16 v22, v0

    .line 1936
    .line 1937
    aget-object v0, v12, v21

    .line 1938
    .line 1939
    invoke-interface {v10, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1940
    .line 1941
    .line 1942
    goto :goto_3b

    .line 1943
    :cond_52
    move/from16 v22, v0

    .line 1944
    .line 1945
    :goto_3b
    shr-long v2, v2, v20

    .line 1946
    .line 1947
    add-int/lit8 v5, v5, 0x1

    .line 1948
    .line 1949
    move/from16 v0, v22

    .line 1950
    .line 1951
    goto :goto_3a

    .line 1952
    :cond_53
    move/from16 v22, v0

    .line 1953
    .line 1954
    const/16 v0, 0x8

    .line 1955
    .line 1956
    if-ne v4, v0, :cond_56

    .line 1957
    .line 1958
    goto :goto_3c

    .line 1959
    :cond_54
    move/from16 v22, v0

    .line 1960
    .line 1961
    :goto_3c
    if-eq v15, v14, :cond_56

    .line 1962
    .line 1963
    add-int/lit8 v15, v15, 0x1

    .line 1964
    .line 1965
    move/from16 v0, v22

    .line 1966
    .line 1967
    const/4 v5, 0x2

    .line 1968
    goto :goto_39

    .line 1969
    :cond_55
    move/from16 v22, v0

    .line 1970
    .line 1971
    const/16 v16, 0x1f

    .line 1972
    .line 1973
    const/16 v17, 0x7

    .line 1974
    .line 1975
    :cond_56
    invoke-virtual {v11}, Lo/l0;->b()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_f

    .line 1976
    .line 1977
    .line 1978
    add-int/lit8 v9, v9, 0x1

    .line 1979
    .line 1980
    move/from16 v0, v22

    .line 1981
    .line 1982
    const/4 v2, 0x7

    .line 1983
    const/16 v3, 0x1f

    .line 1984
    .line 1985
    const/4 v5, 0x2

    .line 1986
    goto :goto_38

    .line 1987
    :goto_3d
    const/4 v4, 0x0

    .line 1988
    goto :goto_3e

    .line 1989
    :catchall_f
    move-exception v0

    .line 1990
    goto :goto_3d

    .line 1991
    :cond_57
    const/4 v4, 0x0

    .line 1992
    const/16 v16, 0x1f

    .line 1993
    .line 1994
    const/16 v17, 0x7

    .line 1995
    .line 1996
    :try_start_1b
    iput-boolean v4, v6, Lh1/y;->c:Z

    .line 1997
    .line 1998
    goto :goto_3f

    .line 1999
    :catchall_10
    move-exception v0

    .line 2000
    goto :goto_40

    .line 2001
    :goto_3e
    iput-boolean v4, v6, Lh1/y;->c:Z

    .line 2002
    .line 2003
    throw v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_10

    .line 2004
    :cond_58
    const/16 v16, 0x1f

    .line 2005
    .line 2006
    const/16 v17, 0x7

    .line 2007
    .line 2008
    :goto_3f
    monitor-exit v7

    .line 2009
    invoke-virtual {v6}, Lh1/y;->c()Z

    .line 2010
    .line 2011
    .line 2012
    move-result v0

    .line 2013
    if-nez v0, :cond_59

    .line 2014
    .line 2015
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 2016
    .line 2017
    return-object v0

    .line 2018
    :cond_59
    const/4 v2, 0x7

    .line 2019
    const/16 v3, 0x1f

    .line 2020
    .line 2021
    const/4 v5, 0x2

    .line 2022
    goto/16 :goto_37

    .line 2023
    .line 2024
    :goto_40
    monitor-exit v7

    .line 2025
    throw v0

    .line 2026
    :pswitch_14
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 2027
    .line 2028
    check-cast v0, Lg1/j;

    .line 2029
    .line 2030
    const/4 v4, 0x0

    .line 2031
    new-array v2, v4, [Lub/k;

    .line 2032
    .line 2033
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v2

    .line 2037
    check-cast v2, [Lub/k;

    .line 2038
    .line 2039
    invoke-static {v2}, Ln7/d;->c([Lub/k;)Landroid/os/Bundle;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v2

    .line 2043
    iget-object v0, v0, Lg1/j;->b:Lv2/e;

    .line 2044
    .line 2045
    invoke-virtual {v0, v2}, Lv2/e;->x(Landroid/os/Bundle;)V

    .line 2046
    .line 2047
    .line 2048
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 2049
    .line 2050
    .line 2051
    move-result v0

    .line 2052
    if-eqz v0, :cond_5a

    .line 2053
    .line 2054
    const/4 v8, 0x0

    .line 2055
    goto :goto_41

    .line 2056
    :cond_5a
    move-object v8, v2

    .line 2057
    :goto_41
    return-object v8

    .line 2058
    :pswitch_15
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 2059
    .line 2060
    check-cast v0, Lg1/b;

    .line 2061
    .line 2062
    iget-object v2, v0, Lg1/b;->a:Lg1/k;

    .line 2063
    .line 2064
    iget-object v3, v0, Lg1/b;->d:Ljava/lang/Object;

    .line 2065
    .line 2066
    if-eqz v3, :cond_5b

    .line 2067
    .line 2068
    invoke-interface {v2, v0, v3}, Lg1/k;->k0(Lg1/b;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2069
    .line 2070
    .line 2071
    move-result-object v0

    .line 2072
    return-object v0

    .line 2073
    :cond_5b
    const-string v0, "Value should be initialized"

    .line 2074
    .line 2075
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 2076
    .line 2077
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2078
    .line 2079
    .line 2080
    throw v2

    .line 2081
    :pswitch_16
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 2082
    .line 2083
    check-cast v0, Le7/j;

    .line 2084
    .line 2085
    iget-object v0, v0, Le7/j;->h:Lh7/c;

    .line 2086
    .line 2087
    iget-boolean v2, v0, Lh7/c;->i:Z

    .line 2088
    .line 2089
    if-eqz v2, :cond_5d

    .line 2090
    .line 2091
    iget-object v2, v0, Lh7/c;->j:Landroidx/lifecycle/z;

    .line 2092
    .line 2093
    iget-object v2, v2, Landroidx/lifecycle/z;->d:Landroidx/lifecycle/p;

    .line 2094
    .line 2095
    sget-object v3, Landroidx/lifecycle/p;->a:Landroidx/lifecycle/p;

    .line 2096
    .line 2097
    if-eq v2, v3, :cond_5c

    .line 2098
    .line 2099
    iget-object v2, v0, Lh7/c;->a:Le7/j;

    .line 2100
    .line 2101
    iget-object v0, v0, Lh7/c;->m:Lub/p;

    .line 2102
    .line 2103
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 2104
    .line 2105
    .line 2106
    move-result-object v0

    .line 2107
    check-cast v0, Landroidx/lifecycle/u0;

    .line 2108
    .line 2109
    const/4 v3, 0x4

    .line 2110
    invoke-static {v2, v0, v3}, Lpe/d;->B(Landroidx/lifecycle/x0;Landroidx/lifecycle/u0;I)Landroidx/lifecycle/v0;

    .line 2111
    .line 2112
    .line 2113
    move-result-object v0

    .line 2114
    const-class v2, Lh7/b;

    .line 2115
    .line 2116
    sget-object v3, Ljc/z;->a:Ljc/a0;

    .line 2117
    .line 2118
    invoke-virtual {v3, v2}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 2119
    .line 2120
    .line 2121
    move-result-object v2

    .line 2122
    invoke-virtual {v0, v2}, Landroidx/lifecycle/v0;->a(Lpc/c;)Landroidx/lifecycle/s0;

    .line 2123
    .line 2124
    .line 2125
    move-result-object v0

    .line 2126
    check-cast v0, Lh7/b;

    .line 2127
    .line 2128
    iget-object v0, v0, Lh7/b;->b:Landroidx/lifecycle/j0;

    .line 2129
    .line 2130
    return-object v0

    .line 2131
    :cond_5c
    const-string v0, "You cannot access the NavBackStackEntry\'s SavedStateHandle after the NavBackStackEntry is destroyed."

    .line 2132
    .line 2133
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 2134
    .line 2135
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2136
    .line 2137
    .line 2138
    throw v2

    .line 2139
    :cond_5d
    const-string v0, "You cannot access the NavBackStackEntry\'s SavedStateHandle until it is added to the NavController\'s back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state)."

    .line 2140
    .line 2141
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 2142
    .line 2143
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2144
    .line 2145
    .line 2146
    throw v2

    .line 2147
    :pswitch_17
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 2148
    .line 2149
    check-cast v0, Le3/o;

    .line 2150
    .line 2151
    return-object v0

    .line 2152
    :pswitch_18
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 2153
    .line 2154
    return-object v0

    .line 2155
    :pswitch_19
    const-string v0, "stop_reason"

    .line 2156
    .line 2157
    const-string v2, "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON"

    .line 2158
    .line 2159
    const-string v3, "content_id"

    .line 2160
    .line 2161
    const-string v5, "foreground"

    .line 2162
    .line 2163
    const-class v7, Lcom/cnl/kikoeru/MusicDownloadService;

    .line 2164
    .line 2165
    iget-object v8, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 2166
    .line 2167
    check-cast v8, Landroidx/media3/exoplayer/offline/d;

    .line 2168
    .line 2169
    iget-object v9, v8, Landroidx/media3/exoplayer/offline/d;->a:Landroidx/media3/exoplayer/offline/o;

    .line 2170
    .line 2171
    iget v8, v8, Landroidx/media3/exoplayer/offline/d;->b:I

    .line 2172
    .line 2173
    if-eqz v8, :cond_62

    .line 2174
    .line 2175
    const/4 v15, 0x1

    .line 2176
    if-eq v8, v15, :cond_61

    .line 2177
    .line 2178
    const/4 v10, 0x2

    .line 2179
    if-eq v8, v10, :cond_60

    .line 2180
    .line 2181
    const/4 v10, 0x4

    .line 2182
    if-eq v8, v10, :cond_5f

    .line 2183
    .line 2184
    if-eq v8, v6, :cond_5e

    .line 2185
    .line 2186
    goto :goto_42

    .line 2187
    :cond_5e
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 2188
    .line 2189
    .line 2190
    move-result-object v0

    .line 2191
    iget-object v2, v9, Landroidx/media3/exoplayer/offline/o;->a:Ljava/lang/String;

    .line 2192
    .line 2193
    const-string v6, "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD"

    .line 2194
    .line 2195
    sget-object v8, Landroidx/media3/exoplayer/offline/r;->i:Ljava/util/HashMap;

    .line 2196
    .line 2197
    new-instance v8, Landroid/content/Intent;

    .line 2198
    .line 2199
    invoke-direct {v8, v0, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2200
    .line 2201
    .line 2202
    invoke-virtual {v8, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 2203
    .line 2204
    .line 2205
    move-result-object v6

    .line 2206
    const/4 v4, 0x0

    .line 2207
    invoke-virtual {v6, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2208
    .line 2209
    .line 2210
    move-result-object v4

    .line 2211
    invoke-virtual {v4, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2212
    .line 2213
    .line 2214
    move-result-object v2

    .line 2215
    invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 2216
    .line 2217
    .line 2218
    goto :goto_42

    .line 2219
    :cond_5f
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v0

    .line 2223
    invoke-static {v0, v9}, Landroidx/media3/exoplayer/offline/r;->c(Lcom/cnl/kikoeru/MainApplication;Landroidx/media3/exoplayer/offline/o;)V

    .line 2224
    .line 2225
    .line 2226
    goto :goto_42

    .line 2227
    :cond_60
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 2228
    .line 2229
    .line 2230
    move-result-object v6

    .line 2231
    iget-object v8, v9, Landroidx/media3/exoplayer/offline/o;->a:Ljava/lang/String;

    .line 2232
    .line 2233
    sget-object v9, Landroidx/media3/exoplayer/offline/r;->i:Ljava/util/HashMap;

    .line 2234
    .line 2235
    new-instance v9, Landroid/content/Intent;

    .line 2236
    .line 2237
    invoke-direct {v9, v6, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2238
    .line 2239
    .line 2240
    invoke-virtual {v9, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 2241
    .line 2242
    .line 2243
    move-result-object v2

    .line 2244
    const/4 v4, 0x0

    .line 2245
    invoke-virtual {v2, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2246
    .line 2247
    .line 2248
    move-result-object v2

    .line 2249
    invoke-virtual {v2, v3, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v2

    .line 2253
    invoke-virtual {v2, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2254
    .line 2255
    .line 2256
    move-result-object v0

    .line 2257
    invoke-virtual {v6, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 2258
    .line 2259
    .line 2260
    goto :goto_42

    .line 2261
    :cond_61
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v0

    .line 2265
    invoke-static {v0, v9}, Landroidx/media3/exoplayer/offline/r;->c(Lcom/cnl/kikoeru/MainApplication;Landroidx/media3/exoplayer/offline/o;)V

    .line 2266
    .line 2267
    .line 2268
    goto :goto_42

    .line 2269
    :cond_62
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 2270
    .line 2271
    .line 2272
    move-result-object v6

    .line 2273
    iget-object v8, v9, Landroidx/media3/exoplayer/offline/o;->a:Ljava/lang/String;

    .line 2274
    .line 2275
    sget-object v9, Landroidx/media3/exoplayer/offline/r;->i:Ljava/util/HashMap;

    .line 2276
    .line 2277
    new-instance v9, Landroid/content/Intent;

    .line 2278
    .line 2279
    invoke-direct {v9, v6, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2280
    .line 2281
    .line 2282
    invoke-virtual {v9, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 2283
    .line 2284
    .line 2285
    move-result-object v2

    .line 2286
    const/4 v4, 0x0

    .line 2287
    invoke-virtual {v2, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v2

    .line 2291
    invoke-virtual {v2, v3, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2292
    .line 2293
    .line 2294
    move-result-object v2

    .line 2295
    invoke-virtual {v2, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v0

    .line 2299
    invoke-virtual {v6, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 2300
    .line 2301
    .line 2302
    :goto_42
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 2303
    .line 2304
    return-object v0

    .line 2305
    :pswitch_1a
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 2306
    .line 2307
    check-cast v0, Ld3/b;

    .line 2308
    .line 2309
    iget-object v2, v0, Ld3/b;->c:Lx0/e1;

    .line 2310
    .line 2311
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 2312
    .line 2313
    .line 2314
    move-result-object v3

    .line 2315
    check-cast v3, Lp1/e;

    .line 2316
    .line 2317
    iget-wide v3, v3, Lp1/e;->a:J

    .line 2318
    .line 2319
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    cmp-long v7, v3, v5

    .line 2325
    .line 2326
    if-nez v7, :cond_63

    .line 2327
    .line 2328
    goto :goto_43

    .line 2329
    :cond_63
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 2330
    .line 2331
    .line 2332
    move-result-object v3

    .line 2333
    check-cast v3, Lp1/e;

    .line 2334
    .line 2335
    iget-wide v3, v3, Lp1/e;->a:J

    .line 2336
    .line 2337
    invoke-static {v3, v4}, Lp1/e;->e(J)Z

    .line 2338
    .line 2339
    .line 2340
    move-result v3

    .line 2341
    if-eqz v3, :cond_64

    .line 2342
    .line 2343
    :goto_43
    const/4 v8, 0x0

    .line 2344
    goto :goto_44

    .line 2345
    :cond_64
    iget-object v0, v0, Ld3/b;->a:Lq1/j0;

    .line 2346
    .line 2347
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 2348
    .line 2349
    .line 2350
    move-result-object v2

    .line 2351
    check-cast v2, Lp1/e;

    .line 2352
    .line 2353
    iget-wide v2, v2, Lp1/e;->a:J

    .line 2354
    .line 2355
    invoke-virtual {v0, v2, v3}, Lq1/j0;->b(J)Landroid/graphics/Shader;

    .line 2356
    .line 2357
    .line 2358
    move-result-object v8

    .line 2359
    :goto_44
    return-object v8

    .line 2360
    :pswitch_1b
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 2361
    .line 2362
    move-object v2, v0

    .line 2363
    check-cast v2, Lch/p;

    .line 2364
    .line 2365
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2366
    .line 2367
    .line 2368
    :try_start_1c
    iget-object v0, v2, Lch/p;->w:Lch/y;

    .line 2369
    .line 2370
    const/4 v4, 0x0

    .line 2371
    const/4 v10, 0x2

    .line 2372
    invoke-virtual {v0, v10, v4, v4}, Lch/y;->o(IIZ)V
    :try_end_1c
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_2

    .line 2373
    .line 2374
    .line 2375
    goto :goto_45

    .line 2376
    :catch_2
    move-exception v0

    .line 2377
    sget-object v3, Lch/b;->d:Lch/b;

    .line 2378
    .line 2379
    invoke-virtual {v2, v3, v3, v0}, Lch/p;->b(Lch/b;Lch/b;Ljava/io/IOException;)V

    .line 2380
    .line 2381
    .line 2382
    :goto_45
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 2383
    .line 2384
    return-object v0

    .line 2385
    :pswitch_1c
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 2386
    .line 2387
    check-cast v0, Lba/i1;

    .line 2388
    .line 2389
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 2390
    .line 2391
    .line 2392
    move-result-object v2

    .line 2393
    invoke-virtual {v2}, Lcom/cnl/kikoeru/data/db/AppDatabase;->u()Ld9/s;

    .line 2394
    .line 2395
    .line 2396
    move-result-object v2

    .line 2397
    iget-object v2, v2, Ld9/s;->a:Ln7/v;

    .line 2398
    .line 2399
    new-instance v3, Ld9/i;

    .line 2400
    .line 2401
    invoke-direct {v3, v6}, Ld9/i;-><init>(I)V

    .line 2402
    .line 2403
    .line 2404
    const/4 v4, 0x0

    .line 2405
    const/4 v15, 0x1

    .line 2406
    invoke-static {v2, v15, v4, v3}, Lua/l;->W(Ln7/v;ZZLic/k;)Ljava/lang/Object;

    .line 2407
    .line 2408
    .line 2409
    move-result-object v2

    .line 2410
    check-cast v2, Ljava/util/List;

    .line 2411
    .line 2412
    check-cast v2, Ljava/lang/Iterable;

    .line 2413
    .line 2414
    new-instance v3, Ljava/util/ArrayList;

    .line 2415
    .line 2416
    const/16 v4, 0xa

    .line 2417
    .line 2418
    invoke-static {v2, v4}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 2419
    .line 2420
    .line 2421
    move-result v4

    .line 2422
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 2423
    .line 2424
    .line 2425
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2426
    .line 2427
    .line 2428
    move-result-object v2

    .line 2429
    :goto_46
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2430
    .line 2431
    .line 2432
    move-result v4

    .line 2433
    if-eqz v4, :cond_65

    .line 2434
    .line 2435
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2436
    .line 2437
    .line 2438
    move-result-object v4

    .line 2439
    check-cast v4, Ljava/lang/Number;

    .line 2440
    .line 2441
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 2442
    .line 2443
    .line 2444
    move-result-wide v4

    .line 2445
    invoke-static {v4, v5}, Lna/w;->a(J)Ljava/lang/String;

    .line 2446
    .line 2447
    .line 2448
    move-result-object v4

    .line 2449
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2450
    .line 2451
    .line 2452
    goto :goto_46

    .line 2453
    :cond_65
    iget-object v0, v0, Lba/i1;->f:Lub/p;

    .line 2454
    .line 2455
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 2456
    .line 2457
    .line 2458
    move-result-object v0

    .line 2459
    check-cast v0, Ljava/util/List;

    .line 2460
    .line 2461
    check-cast v0, Ljava/lang/Iterable;

    .line 2462
    .line 2463
    const-string v2, "elements"

    .line 2464
    .line 2465
    invoke-static {v0, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2466
    .line 2467
    .line 2468
    invoke-static {v0}, Lvb/m;->T(Ljava/lang/Iterable;)Ljava/util/Collection;

    .line 2469
    .line 2470
    .line 2471
    move-result-object v0

    .line 2472
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 2473
    .line 2474
    .line 2475
    move-result v2

    .line 2476
    if-eqz v2, :cond_66

    .line 2477
    .line 2478
    invoke-static {v3}, Lvb/m;->G0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2479
    .line 2480
    .line 2481
    move-result-object v0

    .line 2482
    goto :goto_48

    .line 2483
    :cond_66
    new-instance v2, Ljava/util/ArrayList;

    .line 2484
    .line 2485
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2486
    .line 2487
    .line 2488
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2489
    .line 2490
    .line 2491
    move-result-object v3

    .line 2492
    :cond_67
    :goto_47
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2493
    .line 2494
    .line 2495
    move-result v4

    .line 2496
    if-eqz v4, :cond_68

    .line 2497
    .line 2498
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2499
    .line 2500
    .line 2501
    move-result-object v4

    .line 2502
    invoke-interface {v0, v4}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 2503
    .line 2504
    .line 2505
    move-result v5

    .line 2506
    if-nez v5, :cond_67

    .line 2507
    .line 2508
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2509
    .line 2510
    .line 2511
    goto :goto_47

    .line 2512
    :cond_68
    move-object v0, v2

    .line 2513
    :goto_48
    check-cast v0, Ljava/lang/Iterable;

    .line 2514
    .line 2515
    const/16 v2, 0x1388

    .line 2516
    .line 2517
    invoke-static {v0, v2}, Lvb/m;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2518
    .line 2519
    .line 2520
    move-result-object v0

    .line 2521
    return-object v0

    .line 2522
    :pswitch_1d
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 2523
    .line 2524
    check-cast v0, Lba/f1;

    .line 2525
    .line 2526
    iget-object v2, v0, Lba/f1;->c:Lba/i1;

    .line 2527
    .line 2528
    if-eqz v2, :cond_69

    .line 2529
    .line 2530
    new-instance v0, Lba/i1;

    .line 2531
    .line 2532
    iget-object v3, v2, Lba/i1;->b:Ljava/lang/String;

    .line 2533
    .line 2534
    iget-object v4, v2, Lba/i1;->c:Lbg/t;

    .line 2535
    .line 2536
    iget-object v2, v2, Lba/i1;->e:Ljava/lang/String;

    .line 2537
    .line 2538
    const/4 v15, 0x1

    .line 2539
    invoke-direct {v0, v3, v4, v15, v2}, Lba/i1;-><init>(Ljava/lang/String;Lbg/t;ZLjava/lang/String;)V

    .line 2540
    .line 2541
    .line 2542
    goto :goto_49

    .line 2543
    :cond_69
    const/4 v15, 0x1

    .line 2544
    new-instance v2, Lba/i1;

    .line 2545
    .line 2546
    iget-object v0, v0, Lba/f1;->b:Ljava/lang/String;

    .line 2547
    .line 2548
    const-string v3, ""

    .line 2549
    .line 2550
    const/4 v5, 0x0

    .line 2551
    invoke-direct {v2, v3, v5, v15, v0}, Lba/i1;-><init>(Ljava/lang/String;Lbg/t;ZLjava/lang/String;)V

    .line 2552
    .line 2553
    .line 2554
    move-object v0, v2

    .line 2555
    :goto_49
    return-object v0

    .line 2556
    :pswitch_1e
    const/4 v5, 0x0

    .line 2557
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 2558
    .line 2559
    check-cast v0, Lb8/g;

    .line 2560
    .line 2561
    new-instance v2, Lb8/f;

    .line 2562
    .line 2563
    iget-object v3, v0, Lb8/g;->a:Landroid/content/Context;

    .line 2564
    .line 2565
    iget-object v6, v0, Lb8/g;->b:Ljava/lang/String;

    .line 2566
    .line 2567
    new-instance v7, Lb0/c1;

    .line 2568
    .line 2569
    const/4 v8, 0x3

    .line 2570
    const/4 v4, 0x0

    .line 2571
    invoke-direct {v7, v8, v4}, Lb0/c1;-><init>(IZ)V

    .line 2572
    .line 2573
    .line 2574
    iput-object v5, v7, Lb0/c1;->b:Ljava/lang/Object;

    .line 2575
    .line 2576
    iget-object v4, v0, Lb8/g;->c:Lb7/m;

    .line 2577
    .line 2578
    invoke-direct {v2, v3, v6, v7, v4}, Lb8/f;-><init>(Landroid/content/Context;Ljava/lang/String;Lb0/c1;Lb7/m;)V

    .line 2579
    .line 2580
    .line 2581
    iget-boolean v0, v0, Lb8/g;->e:Z

    .line 2582
    .line 2583
    invoke-virtual {v2, v0}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 2584
    .line 2585
    .line 2586
    return-object v2

    .line 2587
    :pswitch_1f
    iget-object v0, v1, Landroidx/lifecycle/n0;->b:Ljava/lang/Object;

    .line 2588
    .line 2589
    check-cast v0, Landroidx/lifecycle/x0;

    .line 2590
    .line 2591
    invoke-static {v0}, Landroidx/lifecycle/m0;->g(Landroidx/lifecycle/x0;)Landroidx/lifecycle/p0;

    .line 2592
    .line 2593
    .line 2594
    move-result-object v0

    .line 2595
    return-object v0

    .line 2596
    nop

    .line 2597
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_f
    .end packed-switch
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    .line 3388
    .line 3389
    .line 3390
    .line 3391
    .line 3392
    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    .line 3400
    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    .line 3406
    .line 3407
    .line 3408
    .line 3409
    .line 3410
    .line 3411
    .line 3412
    .line 3413
    .line 3414
    .line 3415
    .line 3416
    .line 3417
    .line 3418
    .line 3419
    .line 3420
    .line 3421
    .line 3422
    .line 3423
    .line 3424
    .line 3425
    .line 3426
    .line 3427
    .line 3428
    .line 3429
    .line 3430
    .line 3431
    .line 3432
    .line 3433
    .line 3434
    .line 3435
    .line 3436
    .line 3437
    .line 3438
    .line 3439
    .line 3440
    .line 3441
    .line 3442
    .line 3443
    .line 3444
    .line 3445
    .line 3446
    .line 3447
    .line 3448
    .line 3449
    .line 3450
    .line 3451
    .line 3452
    .line 3453
    .line 3454
    .line 3455
    .line 3456
    .line 3457
    .line 3458
    .line 3459
    .line 3460
    .line 3461
    .line 3462
    .line 3463
    .line 3464
    .line 3465
    .line 3466
    .line 3467
    .line 3468
    .line 3469
    .line 3470
    .line 3471
    .line 3472
    .line 3473
    .line 3474
    .line 3475
    .line 3476
    .line 3477
    .line 3478
    .line 3479
    .line 3480
    .line 3481
    .line 3482
    .line 3483
    .line 3484
    .line 3485
    .line 3486
    .line 3487
    .line 3488
    .line 3489
    .line 3490
    .line 3491
    .line 3492
    .line 3493
    .line 3494
    .line 3495
    .line 3496
    .line 3497
    .line 3498
    .line 3499
    .line 3500
    .line 3501
    .line 3502
    .line 3503
    .line 3504
    .line 3505
    .line 3506
    .line 3507
    .line 3508
    .line 3509
    .line 3510
    .line 3511
    .line 3512
    .line 3513
    .line 3514
    .line 3515
    .line 3516
    .line 3517
    .line 3518
    .line 3519
    .line 3520
    .line 3521
    .line 3522
    .line 3523
    .line 3524
    .line 3525
    .line 3526
    .line 3527
    .line 3528
    .line 3529
    .line 3530
    .line 3531
    .line 3532
    .line 3533
    .line 3534
    .line 3535
    .line 3536
    .line 3537
    .line 3538
    .line 3539
    .line 3540
    .line 3541
    .line 3542
    .line 3543
    .line 3544
    .line 3545
    .line 3546
    .line 3547
    .line 3548
    .line 3549
    .line 3550
    .line 3551
    .line 3552
    .line 3553
    .line 3554
    .line 3555
    .line 3556
    .line 3557
    .line 3558
    .line 3559
    .line 3560
    .line 3561
    .line 3562
    .line 3563
    .line 3564
    .line 3565
    .line 3566
    .line 3567
    .line 3568
    .line 3569
    .line 3570
    .line 3571
    .line 3572
    .line 3573
    .line 3574
    .line 3575
    .line 3576
    .line 3577
    .line 3578
    .line 3579
    .line 3580
    .line 3581
    .line 3582
    .line 3583
    .line 3584
    .line 3585
    .line 3586
    .line 3587
    .line 3588
    .line 3589
    .line 3590
    .line 3591
    .line 3592
    .line 3593
    .line 3594
    .line 3595
    .line 3596
    .line 3597
    .line 3598
    .line 3599
    .line 3600
    .line 3601
    .line 3602
    .line 3603
    .line 3604
    .line 3605
    .line 3606
    .line 3607
    .line 3608
    .line 3609
    .line 3610
    .line 3611
    .line 3612
    .line 3613
    .line 3614
    .line 3615
    .line 3616
    .line 3617
    .line 3618
    .line 3619
    .line 3620
    .line 3621
    .line 3622
    .line 3623
    .line 3624
    .line 3625
    .line 3626
    .line 3627
    .line 3628
    .line 3629
    .line 3630
    .line 3631
    .line 3632
    .line 3633
    .line 3634
    .line 3635
    .line 3636
    .line 3637
    .line 3638
    .line 3639
    .line 3640
    .line 3641
    .line 3642
    .line 3643
    .line 3644
    .line 3645
    .line 3646
    .line 3647
    .line 3648
    .line 3649
    .line 3650
    .line 3651
    .line 3652
    .line 3653
    .line 3654
    .line 3655
    .line 3656
    .line 3657
    .line 3658
    .line 3659
    .line 3660
    .line 3661
    .line 3662
    .line 3663
    .line 3664
    .line 3665
    .line 3666
    .line 3667
    .line 3668
    .line 3669
    .line 3670
    .line 3671
    .line 3672
    .line 3673
    .line 3674
    .line 3675
    .line 3676
    .line 3677
    .line 3678
    .line 3679
    .line 3680
    .line 3681
    .line 3682
    .line 3683
    .line 3684
    .line 3685
    .line 3686
    .line 3687
    .line 3688
    .line 3689
    .line 3690
    .line 3691
    .line 3692
    .line 3693
    .line 3694
    .line 3695
    .line 3696
    .line 3697
    .line 3698
    .line 3699
    .line 3700
    .line 3701
    .line 3702
    .line 3703
    .line 3704
    .line 3705
    .line 3706
    .line 3707
    .line 3708
    .line 3709
    .line 3710
    .line 3711
    .line 3712
    .line 3713
    .line 3714
    .line 3715
    .line 3716
    .line 3717
    .line 3718
    .line 3719
    .line 3720
    .line 3721
    .line 3722
    .line 3723
    .line 3724
    .line 3725
    .line 3726
    .line 3727
    .line 3728
    .line 3729
    .line 3730
    .line 3731
    .line 3732
    .line 3733
    .line 3734
    .line 3735
    .line 3736
    .line 3737
    .line 3738
    .line 3739
    .line 3740
    .line 3741
    .line 3742
    .line 3743
    .line 3744
    .line 3745
    .line 3746
    .line 3747
    .line 3748
    .line 3749
    .line 3750
.end method
