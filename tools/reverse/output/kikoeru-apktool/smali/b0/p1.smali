.class public final Lb0/p1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lx0/e0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lb0/p1;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lb0/p1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lb0/p1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
    iget v0, p0, Lb0/p1;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lb0/p1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lb0/p1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Ly/s1;

    .line 11
    .line 12
    check-cast v1, Landroid/view/View;

    .line 13
    .line 14
    iget v0, v2, Ly/s1;->s:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    iput v0, v2, Ly/s1;->s:I

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    sget-object v0, Lu3/s;->a:Ljava/lang/reflect/Field;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-static {v1, v0}, Lu3/l;->c(Landroid/view/View;Lu3/f;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v0}, Lu3/s;->c(Landroid/view/View;Lu3/v;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, v2, Ly/s1;->t:Ly/r0;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void

    .line 37
    :pswitch_0
    check-cast v2, Lr/q1;

    .line 38
    .line 39
    check-cast v1, Lr/m1;

    .line 40
    .line 41
    iget-object v0, v2, Lr/q1;->i:Lh1/s;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_1
    check-cast v2, Lr/q1;

    .line 48
    .line 49
    check-cast v1, Lr/j1;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object v0, v1, Lr/j1;->b:Lx0/e1;

    .line 55
    .line 56
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lr/i1;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    iget-object v0, v0, Lr/i1;->a:Lr/m1;

    .line 65
    .line 66
    iget-object v1, v2, Lr/q1;->i:Lh1/s;

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void

    .line 72
    :pswitch_2
    check-cast v2, Lr/q1;

    .line 73
    .line 74
    check-cast v1, Lr/q1;

    .line 75
    .line 76
    iget-object v0, v2, Lr/q1;->j:Lh1/s;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :pswitch_3
    check-cast v2, Lr/e0;

    .line 83
    .line 84
    check-cast v1, Lr/c0;

    .line 85
    .line 86
    iget-object v0, v2, Lr/e0;->a:Lz0/e;

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Lz0/e;->j(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_4
    check-cast v2, Le7/a0;

    .line 93
    .line 94
    check-cast v1, Lna/k;

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v0, v2, Le7/a0;->b:Lh7/g;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v0, v0, Lh7/g;->p:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_5
    check-cast v2, Landroid/content/Context;

    .line 111
    .line 112
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v1, Lj2/o0;

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_6
    check-cast v2, Landroid/content/Context;

    .line 123
    .line 124
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v1, Lj2/n0;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_7
    check-cast v2, Lx0/n2;

    .line 135
    .line 136
    invoke-interface {v2}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Ljava/util/List;

    .line 141
    .line 142
    check-cast v0, Ljava/lang/Iterable;

    .line 143
    .line 144
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_2

    .line 153
    .line 154
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    check-cast v2, Le7/j;

    .line 159
    .line 160
    move-object v3, v1

    .line 161
    check-cast v3, Lf7/i;

    .line 162
    .line 163
    invoke-virtual {v3}, Le7/m0;->b()Le7/l;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v3, v2}, Le7/l;->c(Le7/j;)V

    .line 168
    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_2
    return-void

    .line 172
    :pswitch_8
    check-cast v2, Le7/j;

    .line 173
    .line 174
    iget-object v0, v2, Le7/j;->h:Lh7/c;

    .line 175
    .line 176
    iget-object v0, v0, Lh7/c;->j:Landroidx/lifecycle/z;

    .line 177
    .line 178
    check-cast v1, Lf7/l;

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Landroidx/lifecycle/z;->q1(Landroidx/lifecycle/w;)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :pswitch_9
    check-cast v2, Landroidx/lifecycle/q;

    .line 185
    .line 186
    check-cast v1, Leg/b;

    .line 187
    .line 188
    invoke-virtual {v2, v1}, Landroidx/lifecycle/q;->q1(Landroidx/lifecycle/w;)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :pswitch_a
    check-cast v2, Lb0/q1;

    .line 193
    .line 194
    iget-object v0, v2, Lb0/q1;->c:Lo/l0;

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Lo/l0;->j(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
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
