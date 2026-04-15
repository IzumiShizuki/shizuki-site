.class public final Lld/d;
.super Ljava/lang/Object;

# interfaces
.implements Lic/k;


# static fields
.field public static final b:Lld/d;

.field public static final c:Lld/d;

.field public static final d:Lld/d;

.field public static final e:Lld/d;

.field public static final f:Lld/d;

.field public static final g:Lld/d;

.field public static final h:Lld/d;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lld/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lld/d;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lld/d;->b:Lld/d;

    .line 8
    .line 9
    new-instance v0, Lld/d;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lld/d;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lld/d;->c:Lld/d;

    .line 16
    .line 17
    new-instance v0, Lld/d;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lld/d;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lld/d;->d:Lld/d;

    .line 24
    .line 25
    new-instance v0, Lld/d;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lld/d;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lld/d;->e:Lld/d;

    .line 32
    .line 33
    new-instance v0, Lld/d;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, Lld/d;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lld/d;->f:Lld/d;

    .line 40
    .line 41
    new-instance v0, Lld/d;

    .line 42
    .line 43
    const/4 v1, 0x5

    .line 44
    invoke-direct {v0, v1}, Lld/d;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lld/d;->g:Lld/d;

    .line 48
    .line 49
    new-instance v0, Lld/d;

    .line 50
    .line 51
    const/4 v1, 0x6

    .line 52
    invoke-direct {v0, v1}, Lld/d;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lld/d;->h:Lld/d;

    .line 56
    .line 57
    return-void
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

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lld/d;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lld/d;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const-string v3, "it"

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lyc/c;

    .line 11
    .line 12
    invoke-static {p1, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lvc/i;->z(Lyc/k;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_5

    .line 20
    .line 21
    sget v0, Lld/e;->l:I

    .line 22
    .line 23
    sget-object v0, Lld/f0;->e:Ljava/util/Set;

    .line 24
    .line 25
    invoke-interface {p1}, Lyc/k;->getName()Lbe/e;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v3, 0x0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget-object v0, Lld/d;->c:Lld/d;

    .line 38
    .line 39
    invoke-static {p1, v0}, Lie/d;->b(Lyc/c;Lic/k;)Lyc/c;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    invoke-static {p1}, Lua/l;->K(Lyc/b;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    sget-object v0, Lld/f0;->b:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    sget-object v3, Lld/c0;->a:Lld/c0;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    sget-object v0, Lld/f0;->d:Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    invoke-static {p1, v0}, Lvb/w;->r(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lld/e0;

    .line 70
    .line 71
    sget-object v0, Lld/e0;->b:Lld/e0;

    .line 72
    .line 73
    if-ne p1, v0, :cond_3

    .line 74
    .line 75
    sget-object v3, Lld/c0;->c:Lld/c0;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    sget-object v3, Lld/c0;->b:Lld/c0;

    .line 79
    .line 80
    :cond_4
    :goto_0
    if-eqz v3, :cond_5

    .line 81
    .line 82
    const/4 v1, 0x1

    .line 83
    :cond_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :pswitch_0
    check-cast p1, Lyc/c;

    .line 89
    .line 90
    invoke-static {p1, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    sget v0, Lld/c;->l:I

    .line 94
    .line 95
    check-cast p1, Lbd/s0;

    .line 96
    .line 97
    invoke-static {p1}, Lvc/i;->z(Lyc/k;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_6

    .line 102
    .line 103
    new-instance v0, Lbd/a;

    .line 104
    .line 105
    const/16 v3, 0x8

    .line 106
    .line 107
    invoke-direct {v0, v3, p1}, Lbd/a;-><init>(ILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-static {p1, v0}, Lie/d;->b(Lyc/c;Lic/k;)Lyc/c;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-eqz p1, :cond_6

    .line 115
    .line 116
    const/4 v1, 0x1

    .line 117
    :cond_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :pswitch_1
    check-cast p1, Lyc/c;

    .line 123
    .line 124
    invoke-static {p1, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-static {p1}, Lie/d;->k(Lyc/c;)Lyc/c;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1}, Lpc/f0;->H(Lyc/c;)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    return-object p1

    .line 140
    :pswitch_2
    check-cast p1, Lbd/y0;

    .line 141
    .line 142
    check-cast p1, Lbd/z0;

    .line 143
    .line 144
    invoke-virtual {p1}, Lbd/z0;->b()Lse/w;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    return-object p1

    .line 149
    :pswitch_3
    check-cast p1, Lyc/c;

    .line 150
    .line 151
    invoke-static {p1, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-static {p1}, Lpc/f0;->H(Lyc/c;)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    return-object p1

    .line 163
    :pswitch_4
    check-cast p1, Lyc/c;

    .line 164
    .line 165
    sget v0, Lld/e;->l:I

    .line 166
    .line 167
    invoke-static {p1, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    instance-of v0, p1, Lyc/t;

    .line 171
    .line 172
    if-eqz v0, :cond_7

    .line 173
    .line 174
    sget-object v0, Lld/f0;->f:Ljava/util/Set;

    .line 175
    .line 176
    check-cast v0, Ljava/lang/Iterable;

    .line 177
    .line 178
    invoke-static {p1}, Lua/l;->K(Lyc/b;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-static {v0, p1}, Lvb/m;->S(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-eqz p1, :cond_7

    .line 187
    .line 188
    const/4 v1, 0x1

    .line 189
    :cond_7
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    return-object p1

    .line 194
    :pswitch_5
    check-cast p1, Lyc/c;

    .line 195
    .line 196
    sget v0, Lld/e;->l:I

    .line 197
    .line 198
    invoke-static {p1, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    sget-object v0, Lld/f0;->f:Ljava/util/Set;

    .line 202
    .line 203
    check-cast v0, Ljava/lang/Iterable;

    .line 204
    .line 205
    invoke-static {p1}, Lua/l;->K(Lyc/b;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-static {v0, p1}, Lvb/m;->S(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    return-object p1

    .line 218
    nop

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
