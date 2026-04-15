.class public final Lu3/w0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final b:Lu3/w0;


# instance fields
.field public final a:Lu3/t0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Lu3/s0;->s:Lu3/w0;

    .line 8
    .line 9
    sput-object v0, Lu3/w0;->b:Lu3/w0;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/16 v1, 0x1e

    .line 13
    .line 14
    if-lt v0, v1, :cond_1

    .line 15
    .line 16
    sget-object v0, Lu3/q0;->r:Lu3/w0;

    .line 17
    .line 18
    sput-object v0, Lu3/w0;->b:Lu3/w0;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    sget-object v0, Lu3/t0;->b:Lu3/w0;

    .line 22
    .line 23
    sput-object v0, Lu3/w0;->b:Lu3/w0;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Lu3/s0;

    invoke-direct {v0, p0, p1}, Lu3/s0;-><init>(Lu3/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lu3/w0;->a:Lu3/t0;

    return-void

    :cond_0
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, Lu3/r0;

    invoke-direct {v0, p0, p1}, Lu3/r0;-><init>(Lu3/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lu3/w0;->a:Lu3/t0;

    return-void

    :cond_1
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, Lu3/q0;

    invoke-direct {v0, p0, p1}, Lu3/q0;-><init>(Lu3/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lu3/w0;->a:Lu3/t0;

    return-void

    :cond_2
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_3

    .line 6
    new-instance v0, Lu3/p0;

    invoke-direct {v0, p0, p1}, Lu3/p0;-><init>(Lu3/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lu3/w0;->a:Lu3/t0;

    return-void

    :cond_3
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_4

    .line 7
    new-instance v0, Lu3/o0;

    invoke-direct {v0, p0, p1}, Lu3/o0;-><init>(Lu3/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lu3/w0;->a:Lu3/t0;

    return-void

    .line 8
    :cond_4
    new-instance v0, Lu3/n0;

    invoke-direct {v0, p0, p1}, Lu3/n0;-><init>(Lu3/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lu3/w0;->a:Lu3/t0;

    return-void
.end method

.method public constructor <init>(Lu3/w0;)V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_7

    .line 10
    iget-object p1, p1, Lu3/w0;->a:Lu3/t0;

    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    instance-of v1, p1, Lu3/s0;

    if-eqz v1, :cond_0

    .line 12
    new-instance v0, Lu3/s0;

    move-object v1, p1

    check-cast v1, Lu3/s0;

    invoke-direct {v0, p0, v1}, Lu3/s0;-><init>(Lu3/w0;Lu3/s0;)V

    iput-object v0, p0, Lu3/w0;->a:Lu3/t0;

    goto/16 :goto_0

    :cond_0
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    .line 13
    instance-of v1, p1, Lu3/r0;

    if-eqz v1, :cond_1

    .line 14
    new-instance v0, Lu3/r0;

    move-object v1, p1

    check-cast v1, Lu3/r0;

    invoke-direct {v0, p0, v1}, Lu3/r0;-><init>(Lu3/w0;Lu3/r0;)V

    iput-object v0, p0, Lu3/w0;->a:Lu3/t0;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    .line 15
    instance-of v1, p1, Lu3/q0;

    if-eqz v1, :cond_2

    .line 16
    new-instance v0, Lu3/q0;

    move-object v1, p1

    check-cast v1, Lu3/q0;

    invoke-direct {v0, p0, v1}, Lu3/q0;-><init>(Lu3/w0;Lu3/q0;)V

    iput-object v0, p0, Lu3/w0;->a:Lu3/t0;

    goto :goto_0

    :cond_2
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_3

    .line 17
    instance-of v1, p1, Lu3/p0;

    if-eqz v1, :cond_3

    .line 18
    new-instance v0, Lu3/p0;

    move-object v1, p1

    check-cast v1, Lu3/p0;

    invoke-direct {v0, p0, v1}, Lu3/p0;-><init>(Lu3/w0;Lu3/p0;)V

    iput-object v0, p0, Lu3/w0;->a:Lu3/t0;

    goto :goto_0

    :cond_3
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_4

    .line 19
    instance-of v0, p1, Lu3/o0;

    if-eqz v0, :cond_4

    .line 20
    new-instance v0, Lu3/o0;

    move-object v1, p1

    check-cast v1, Lu3/o0;

    invoke-direct {v0, p0, v1}, Lu3/o0;-><init>(Lu3/w0;Lu3/o0;)V

    iput-object v0, p0, Lu3/w0;->a:Lu3/t0;

    goto :goto_0

    .line 21
    :cond_4
    instance-of v0, p1, Lu3/n0;

    if-eqz v0, :cond_5

    .line 22
    new-instance v0, Lu3/n0;

    move-object v1, p1

    check-cast v1, Lu3/n0;

    invoke-direct {v0, p0, v1}, Lu3/n0;-><init>(Lu3/w0;Lu3/n0;)V

    iput-object v0, p0, Lu3/w0;->a:Lu3/t0;

    goto :goto_0

    .line 23
    :cond_5
    instance-of v0, p1, Lu3/m0;

    if-eqz v0, :cond_6

    .line 24
    new-instance v0, Lu3/m0;

    move-object v1, p1

    check-cast v1, Lu3/m0;

    invoke-direct {v0, p0, v1}, Lu3/m0;-><init>(Lu3/w0;Lu3/m0;)V

    iput-object v0, p0, Lu3/w0;->a:Lu3/t0;

    goto :goto_0

    .line 25
    :cond_6
    new-instance v0, Lu3/t0;

    invoke-direct {v0, p0}, Lu3/t0;-><init>(Lu3/w0;)V

    iput-object v0, p0, Lu3/w0;->a:Lu3/t0;

    .line 26
    :goto_0
    invoke-virtual {p1, p0}, Lu3/t0;->e(Lu3/w0;)V

    return-void

    .line 27
    :cond_7
    new-instance p1, Lu3/t0;

    invoke-direct {p1, p0}, Lu3/t0;-><init>(Lu3/w0;)V

    iput-object p1, p0, Lu3/w0;->a:Lu3/t0;

    return-void
.end method

.method public static a(Lp3/b;IIII)Lp3/b;
    .locals 5

    .line 1
    iget v0, p0, Lp3/b;->a:I

    .line 2
    .line 3
    sub-int/2addr v0, p1

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v2, p0, Lp3/b;->b:I

    .line 10
    .line 11
    sub-int/2addr v2, p2

    .line 12
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    iget v3, p0, Lp3/b;->c:I

    .line 17
    .line 18
    sub-int/2addr v3, p3

    .line 19
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget v4, p0, Lp3/b;->d:I

    .line 24
    .line 25
    sub-int/2addr v4, p4

    .line 26
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ne v0, p1, :cond_0

    .line 31
    .line 32
    if-ne v2, p2, :cond_0

    .line 33
    .line 34
    if-ne v3, p3, :cond_0

    .line 35
    .line 36
    if-ne v1, p4, :cond_0

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_0
    invoke-static {v0, v2, v3, v1}, Lp3/b;->b(IIII)Lp3/b;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
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
.end method

.method public static c(Landroid/view/View;Landroid/view/WindowInsets;)Lu3/w0;
    .locals 2

    .line 1
    new-instance v0, Lu3/w0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p1}, Lu3/w0;-><init>(Landroid/view/WindowInsets;)V

    .line 7
    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    sget-object p1, Lu3/s;->a:Ljava/lang/reflect/Field;

    .line 18
    .line 19
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v1, 0x17

    .line 22
    .line 23
    if-lt p1, v1, :cond_0

    .line 24
    .line 25
    invoke-static {p0}, Lu3/m;->a(Landroid/view/View;)Lu3/w0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {p0}, Lu3/l;->b(Landroid/view/View;)Lu3/w0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    iget-object v1, v0, Lu3/w0;->a:Lu3/t0;

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Lu3/t0;->t(Lu3/w0;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v1, p1}, Lu3/t0;->d(Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-virtual {v1, p0}, Lu3/t0;->v(I)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-object v0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method


# virtual methods
.method public final b()Landroid/view/WindowInsets;
    .locals 2

    .line 1
    iget-object v0, p0, Lu3/w0;->a:Lu3/t0;

    .line 2
    .line 3
    instance-of v1, v0, Lu3/m0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lu3/m0;

    .line 8
    .line 9
    iget-object v0, v0, Lu3/m0;->c:Landroid/view/WindowInsets;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lu3/w0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, Lu3/w0;

    .line 12
    .line 13
    iget-object v0, p0, Lu3/w0;->a:Lu3/t0;

    .line 14
    .line 15
    iget-object p1, p1, Lu3/w0;->a:Lu3/t0;

    .line 16
    .line 17
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lu3/w0;->a:Lu3/t0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lu3/t0;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
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
