.class public final Luh/n;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Luh/y;


# direct methods
.method public synthetic constructor <init>(Luh/y;I)V
    .locals 0

    .line 1
    iput p2, p0, Luh/n;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Luh/n;->c:Luh/y;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
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
    .locals 11

    .line 1
    iget v0, p0, Luh/n;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Luh/n;->c:Luh/y;

    .line 7
    .line 8
    invoke-virtual {v0}, Luh/y;->f()Lu/e1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Luh/n;->c:Luh/y;

    .line 14
    .line 15
    invoke-virtual {v0}, Luh/y;->d()Luh/x;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {v1}, Luh/x;->c()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    const/16 v4, 0x20

    .line 26
    .line 27
    shr-long v5, v2, v4

    .line 28
    .line 29
    long-to-int v6, v5

    .line 30
    int-to-float v5, v6

    .line 31
    const-wide v6, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v2, v6

    .line 37
    long-to-int v3, v2

    .line 38
    int-to-float v2, v3

    .line 39
    invoke-static {v5, v2}, Lu3/x0;->b(FF)J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    invoke-virtual {v0}, Luh/y;->f()Lu/e1;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {v2, v3, v5}, Lua/l;->S(JLu/e1;)F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-virtual {v1}, Luh/x;->d()J

    .line 52
    .line 53
    .line 54
    move-result-wide v8

    .line 55
    invoke-virtual {v0}, Luh/y;->f()Lu/e1;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v1, "orientation"

    .line 60
    .line 61
    invoke-static {v0, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    if-ne v0, v1, :cond_0

    .line 72
    .line 73
    shr-long v0, v8, v4

    .line 74
    .line 75
    :goto_0
    long-to-int v1, v0

    .line 76
    goto :goto_1

    .line 77
    :cond_0
    new-instance v0, Lce/j0;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 80
    .line 81
    .line 82
    throw v0

    .line 83
    :cond_1
    and-long v0, v8, v6

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :goto_1
    int-to-float v0, v1

    .line 87
    add-float/2addr v2, v0

    .line 88
    const/high16 v0, 0x3f800000    # 1.0f

    .line 89
    .line 90
    sub-float/2addr v2, v0

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    const/4 v2, 0x0

    .line 93
    :goto_2
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0

    .line 98
    :pswitch_1
    iget-object v0, p0, Luh/n;->c:Luh/y;

    .line 99
    .line 100
    invoke-virtual {v0}, Luh/y;->d()Luh/x;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    iget-object v2, v0, Luh/y;->a:La0/z;

    .line 107
    .line 108
    invoke-virtual {v2}, La0/z;->a()Lr/y1;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    iget-object v3, v2, Lr/y1;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v3, La0/t;

    .line 115
    .line 116
    invoke-virtual {v2}, Lr/y1;->W()Lu/e1;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    const-wide v4, 0xffffffffL

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    const/16 v6, 0x20

    .line 130
    .line 131
    if-eqz v2, :cond_4

    .line 132
    .line 133
    const/4 v7, 0x1

    .line 134
    if-ne v2, v7, :cond_3

    .line 135
    .line 136
    invoke-virtual {v3}, La0/t;->c()J

    .line 137
    .line 138
    .line 139
    move-result-wide v2

    .line 140
    shr-long/2addr v2, v6

    .line 141
    :goto_3
    long-to-int v3, v2

    .line 142
    goto :goto_4

    .line 143
    :cond_3
    new-instance v0, Lce/j0;

    .line 144
    .line 145
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 146
    .line 147
    .line 148
    throw v0

    .line 149
    :cond_4
    invoke-virtual {v3}, La0/t;->c()J

    .line 150
    .line 151
    .line 152
    move-result-wide v2

    .line 153
    and-long/2addr v2, v4

    .line 154
    goto :goto_3

    .line 155
    :goto_4
    int-to-float v2, v3

    .line 156
    invoke-virtual {v1}, Luh/x;->c()J

    .line 157
    .line 158
    .line 159
    move-result-wide v7

    .line 160
    shr-long v9, v7, v6

    .line 161
    .line 162
    long-to-int v1, v9

    .line 163
    int-to-float v1, v1

    .line 164
    and-long/2addr v4, v7

    .line 165
    long-to-int v3, v4

    .line 166
    int-to-float v3, v3

    .line 167
    invoke-static {v1, v3}, Lu3/x0;->b(FF)J

    .line 168
    .line 169
    .line 170
    move-result-wide v3

    .line 171
    invoke-virtual {v0}, Luh/y;->f()Lu/e1;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v3, v4, v0}, Lua/l;->S(JLu/e1;)F

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    sub-float/2addr v2, v0

    .line 180
    const/high16 v0, 0x3f800000    # 1.0f

    .line 181
    .line 182
    sub-float/2addr v2, v0

    .line 183
    goto :goto_5

    .line 184
    :cond_5
    const/4 v2, 0x0

    .line 185
    :goto_5
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    return-object v0

    .line 190
    :pswitch_2
    iget-object v0, p0, Luh/n;->c:Luh/y;

    .line 191
    .line 192
    iget-object v0, v0, Luh/y;->a:La0/z;

    .line 193
    .line 194
    invoke-virtual {v0}, La0/z;->a()Lr/y1;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    return-object v0

    .line 199
    :pswitch_3
    iget-object v0, p0, Luh/n;->c:Luh/y;

    .line 200
    .line 201
    iget-object v0, v0, Luh/y;->j:Lx0/e1;

    .line 202
    .line 203
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    if-eqz v0, :cond_6

    .line 208
    .line 209
    const/4 v0, 0x1

    .line 210
    goto :goto_6

    .line 211
    :cond_6
    const/4 v0, 0x0

    .line 212
    :goto_6
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    return-object v0

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
