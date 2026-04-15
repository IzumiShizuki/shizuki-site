.class public final synthetic Lh8/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lb7/b1;


# direct methods
.method public synthetic constructor <init>(Lb7/b1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh8/d;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lh8/d;->b:Lb7/b1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, Lh8/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh8/d;->b:Lb7/b1;

    .line 7
    .line 8
    sget-object v1, Lx8/h;->a:Lx8/h;

    .line 9
    .line 10
    iget-object v0, v0, Lb7/b1;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/content/Context;

    .line 13
    .line 14
    monitor-enter v1

    .line 15
    :try_start_0
    sget-object v2, Lx8/h;->b:Lk8/f;

    .line 16
    .line 17
    if-nez v2, :cond_2

    .line 18
    .line 19
    sget-object v7, Llh/l;->a:Llh/u;

    .line 20
    .line 21
    sget-object v2, Lhf/l0;->a:Lpf/e;

    .line 22
    .line 23
    sget-object v6, Lpf/d;->c:Lpf/d;

    .line 24
    .line 25
    sget-object v2, Lx8/d;->a:[Landroid/graphics/Bitmap$Config;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 34
    .line 35
    .line 36
    const-string v2, "image_cache"

    .line 37
    .line 38
    invoke-static {v0, v2}, Lfc/b;->i0(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget-object v2, Llh/y;->b:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0}, Lg5/w;->w(Ljava/io/File;)Llh/y;

    .line 45
    .line 46
    .line 47
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    const-wide/16 v2, 0x0

    .line 49
    .line 50
    const-wide v4, 0x3f947ae147ae147bL    # 0.02

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    cmpl-double v0, v4, v2

    .line 56
    .line 57
    if-lez v0, :cond_0

    .line 58
    .line 59
    const-wide/32 v11, 0xa00000

    .line 60
    .line 61
    .line 62
    :try_start_1
    invoke-virtual {v8}, Llh/y;->toFile()Ljava/io/File;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v2, Landroid/os/StatFs;

    .line 74
    .line 75
    invoke-direct {v2, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockCountLong()J

    .line 79
    .line 80
    .line 81
    move-result-wide v9

    .line 82
    long-to-double v9, v9

    .line 83
    mul-double v4, v4, v9

    .line 84
    .line 85
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    long-to-double v2, v2

    .line 90
    mul-double v4, v4, v2

    .line 91
    .line 92
    double-to-long v9, v4

    .line 93
    const-wide/32 v13, 0xfa00000

    .line 94
    .line 95
    .line 96
    invoke-static/range {v9 .. v14}, Lnh/b;->l(JJJ)J

    .line 97
    .line 98
    .line 99
    move-result-wide v11
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    :catch_0
    :goto_0
    move-wide v4, v11

    .line 101
    goto :goto_1

    .line 102
    :cond_0
    const-wide/16 v11, 0x0

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :goto_1
    :try_start_2
    new-instance v3, Lk8/f;

    .line 106
    .line 107
    invoke-direct/range {v3 .. v8}, Lk8/f;-><init>(JLhf/u;Llh/l;Llh/y;)V

    .line 108
    .line 109
    .line 110
    sput-object v3, Lx8/h;->b:Lk8/f;

    .line 111
    .line 112
    move-object v2, v3

    .line 113
    goto :goto_2

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    goto :goto_3

    .line 116
    :cond_1
    const-string v0, "cacheDir == null"

    .line 117
    .line 118
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 119
    .line 120
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    :cond_2
    :goto_2
    monitor-exit v1

    .line 125
    return-object v2

    .line 126
    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 127
    throw v0

    .line 128
    :pswitch_0
    iget-object v0, p0, Lh8/d;->b:Lb7/b1;

    .line 129
    .line 130
    new-instance v1, Lq8/a;

    .line 131
    .line 132
    iget-object v0, v0, Lb7/b1;->b:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Landroid/content/Context;

    .line 135
    .line 136
    invoke-direct {v1, v0}, Lq8/a;-><init>(Landroid/content/Context;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Lq8/a;->a()Lq8/d;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    return-object v0

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
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
