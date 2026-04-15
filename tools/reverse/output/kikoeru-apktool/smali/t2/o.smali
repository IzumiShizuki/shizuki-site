.class public final synthetic Lt2/o;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lch/l;


# direct methods
.method public synthetic constructor <init>(Lch/l;I)V
    .locals 0

    .line 1
    iput p2, p0, Lt2/o;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lt2/o;->b:Lch/l;

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
    .locals 8

    .line 1
    iget v0, p0, Lt2/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt2/o;->b:Lch/l;

    .line 7
    .line 8
    iget-object v0, v0, Lch/l;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v2, v1

    .line 26
    check-cast v2, Lt2/q;

    .line 27
    .line 28
    iget-object v2, v2, Lt2/q;->a:Lb3/c;

    .line 29
    .line 30
    iget-object v2, v2, Lb3/c;->i:Lu2/f;

    .line 31
    .line 32
    invoke-virtual {v2}, Lu2/f;->c()F

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-static {v0}, Lud/b;->r(Ljava/util/List;)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v4, 0x1

    .line 41
    if-gt v4, v3, :cond_2

    .line 42
    .line 43
    :goto_0
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    move-object v6, v5

    .line 48
    check-cast v6, Lt2/q;

    .line 49
    .line 50
    iget-object v6, v6, Lt2/q;->a:Lb3/c;

    .line 51
    .line 52
    iget-object v6, v6, Lb3/c;->i:Lu2/f;

    .line 53
    .line 54
    invoke-virtual {v6}, Lu2/f;->c()F

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    invoke-static {v2, v6}, Ljava/lang/Float;->compare(FF)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-gez v7, :cond_1

    .line 63
    .line 64
    move-object v1, v5

    .line 65
    move v2, v6

    .line 66
    :cond_1
    if-eq v4, v3, :cond_2

    .line 67
    .line 68
    add-int/lit8 v4, v4, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move-object v0, v1

    .line 72
    :goto_1
    check-cast v0, Lt2/q;

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    iget-object v0, v0, Lt2/q;->a:Lb3/c;

    .line 77
    .line 78
    iget-object v0, v0, Lb3/c;->i:Lu2/f;

    .line 79
    .line 80
    invoke-virtual {v0}, Lu2/f;->c()F

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    const/4 v0, 0x0

    .line 86
    :goto_2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0

    .line 91
    :pswitch_0
    iget-object v0, p0, Lt2/o;->b:Lch/l;

    .line 92
    .line 93
    iget-object v0, v0, Lch/l;->f:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    const/4 v0, 0x0

    .line 104
    goto :goto_4

    .line 105
    :cond_4
    const/4 v1, 0x0

    .line 106
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    move-object v2, v1

    .line 111
    check-cast v2, Lt2/q;

    .line 112
    .line 113
    iget-object v2, v2, Lt2/q;->a:Lb3/c;

    .line 114
    .line 115
    invoke-virtual {v2}, Lb3/c;->i()F

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    invoke-static {v0}, Lud/b;->r(Ljava/util/List;)I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    const/4 v4, 0x1

    .line 124
    if-gt v4, v3, :cond_6

    .line 125
    .line 126
    :goto_3
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    move-object v6, v5

    .line 131
    check-cast v6, Lt2/q;

    .line 132
    .line 133
    iget-object v6, v6, Lt2/q;->a:Lb3/c;

    .line 134
    .line 135
    invoke-virtual {v6}, Lb3/c;->i()F

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    invoke-static {v2, v6}, Ljava/lang/Float;->compare(FF)I

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    if-gez v7, :cond_5

    .line 144
    .line 145
    move-object v1, v5

    .line 146
    move v2, v6

    .line 147
    :cond_5
    if-eq v4, v3, :cond_6

    .line 148
    .line 149
    add-int/lit8 v4, v4, 0x1

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_6
    move-object v0, v1

    .line 153
    :goto_4
    check-cast v0, Lt2/q;

    .line 154
    .line 155
    if-eqz v0, :cond_7

    .line 156
    .line 157
    iget-object v0, v0, Lt2/q;->a:Lb3/c;

    .line 158
    .line 159
    invoke-virtual {v0}, Lb3/c;->i()F

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    goto :goto_5

    .line 164
    :cond_7
    const/4 v0, 0x0

    .line 165
    :goto_5
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    return-object v0

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
