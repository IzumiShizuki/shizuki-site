.class public abstract Lj2/l3;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj2/l3;->a:Ljava/util/LinkedHashMap;

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
.end method

.method public static final a(Landroid/content/Context;)Llf/z0;
    .locals 14

    .line 1
    sget-object v1, Lj2/l3;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    invoke-virtual {v1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const-string v0, "animator_duration_scale"

    .line 15
    .line 16
    invoke-static {v0}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const/4 v0, -0x1

    .line 21
    const/4 v2, 0x6

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static {v0, v2, v5}, Lg8/a;->c(IILkf/a;)Lkf/f;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Ln7/e;->h(Landroid/os/Looper;)Landroid/os/Handler;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v5, Lj2/k3;

    .line 36
    .line 37
    invoke-direct {v5, v6, v0}, Lj2/k3;-><init>(Lkf/f;Landroid/os/Handler;)V

    .line 38
    .line 39
    .line 40
    new-instance v2, Lea/f;

    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    move-object v7, p0

    .line 44
    invoke-direct/range {v2 .. v8}, Lea/f;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Lj2/k3;Lkf/f;Landroid/content/Context;Lyb/c;)V

    .line 45
    .line 46
    .line 47
    new-instance p0, Li7/n;

    .line 48
    .line 49
    invoke-direct {p0, v2}, Li7/n;-><init>(Lic/n;)V

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lhf/a0;->d()Lnf/d;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v9, Llf/y0;

    .line 57
    .line 58
    const-wide/16 v2, 0x0

    .line 59
    .line 60
    invoke-direct {v9, v2, v3}, Llf/y0;-><init>(J)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const-string v3, "animator_duration_scale"

    .line 68
    .line 69
    const/high16 v4, 0x3f800000    # 1.0f

    .line 70
    .line 71
    invoke-static {v2, v3, v4}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    invoke-static {p0}, Llf/p0;->i(Llf/f;)Lk9/c;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {v12}, Llf/p0;->c(Ljava/lang/Object;)Llf/b1;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    iget-object v2, p0, Lk9/c;->e:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v2, Lyb/h;

    .line 90
    .line 91
    iget-object p0, p0, Lk9/c;->d:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v10, p0

    .line 94
    check-cast v10, Llf/f;

    .line 95
    .line 96
    sget-object p0, Llf/s0;->a:Llf/u0;

    .line 97
    .line 98
    invoke-virtual {v9, p0}, Llf/y0;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-eqz p0, :cond_0

    .line 103
    .line 104
    sget-object p0, Lhf/z;->a:Lhf/z;

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    sget-object p0, Lhf/z;->d:Lhf/z;

    .line 108
    .line 109
    :goto_0
    new-instance v8, Le/j;

    .line 110
    .line 111
    const/4 v13, 0x0

    .line 112
    invoke-direct/range {v8 .. v13}, Le/j;-><init>(Llf/t0;Llf/f;Llf/h0;Ljava/lang/Object;Lyb/c;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v0, v2, p0, v8}, Lhf/a0;->x(Lhf/y;Lyb/h;Lhf/z;Lic/n;)Lhf/r1;

    .line 116
    .line 117
    .line 118
    new-instance v0, Llf/k0;

    .line 119
    .line 120
    invoke-direct {v0, v11}, Llf/k0;-><init>(Llf/b1;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v1, v7, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :catchall_0
    move-exception v0

    .line 128
    move-object p0, v0

    .line 129
    goto :goto_2

    .line 130
    :cond_1
    :goto_1
    check-cast v0, Llf/z0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    .line 132
    monitor-exit v1

    .line 133
    return-object v0

    .line 134
    :goto_2
    monitor-exit v1

    .line 135
    throw p0
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

.method public static final b(Landroid/view/View;)Lx0/r;
    .locals 1

    .line 1
    const v0, 0x7f070029

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    instance-of v0, p0, Lx0/r;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Lx0/r;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
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
.end method
