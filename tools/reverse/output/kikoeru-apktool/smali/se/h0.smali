.class public final Lse/h0;
.super Lye/d;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final b:Lm0/w;

.field public static final c:Lse/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm0/w;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lm0/w;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lse/h0;->b:Lm0/w;

    .line 9
    .line 10
    new-instance v0, Lse/h0;

    .line 11
    .line 12
    sget-object v1, Lvb/r;->a:Lvb/r;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lse/h0;-><init>(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lse/h0;->c:Lse/h0;

    .line 18
    .line 19
    return-void
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

.method public constructor <init>(Ljava/util/List;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lye/j;->a:Lye/j;

    .line 5
    .line 6
    iput-object v0, p0, Lye/d;->a:Lye/a;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lse/g;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const-class v1, Lse/g;

    .line 28
    .line 29
    sget-object v2, Ljc/z;->a:Ljc/a0;

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Lpc/c;->x()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object v2, Lse/h0;->b:Lm0/w;

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Lm0/w;->D(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iget-object v2, p0, Lye/d;->a:Lye/a;

    .line 49
    .line 50
    invoke-virtual {v2}, Lye/a;->a()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/4 v3, 0x0

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    if-eq v2, v4, :cond_0

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    iget-object v2, p0, Lye/d;->a:Lye/a;

    .line 62
    .line 63
    :try_start_0
    const-string v5, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"

    .line 64
    .line 65
    invoke-static {v2, v5}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    check-cast v2, Lye/o;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    iget v4, v2, Lye/o;->b:I

    .line 71
    .line 72
    if-ne v4, v1, :cond_1

    .line 73
    .line 74
    new-instance v2, Lye/o;

    .line 75
    .line 76
    invoke-direct {v2, v1, v0}, Lye/o;-><init>(ILse/g;)V

    .line 77
    .line 78
    .line 79
    iput-object v2, p0, Lye/d;->a:Lye/a;

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    new-instance v5, Lye/c;

    .line 83
    .line 84
    const/16 v6, 0x14

    .line 85
    .line 86
    new-array v6, v6, [Ljava/lang/Object;

    .line 87
    .line 88
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v6, v5, Lye/c;->a:[Ljava/lang/Object;

    .line 92
    .line 93
    iput v3, v5, Lye/c;->b:I

    .line 94
    .line 95
    iget-object v2, v2, Lye/o;->a:Lse/g;

    .line 96
    .line 97
    invoke-virtual {v5, v4, v2}, Lye/c;->i(ILse/g;)V

    .line 98
    .line 99
    .line 100
    iput-object v5, p0, Lye/d;->a:Lye/a;

    .line 101
    .line 102
    :goto_1
    iget-object v2, p0, Lye/d;->a:Lye/a;

    .line 103
    .line 104
    invoke-virtual {v2, v1, v0}, Lye/a;->i(ILse/g;)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :catch_0
    move-exception p1

    .line 109
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    const-string v1, "OneElementArrayMap"

    .line 112
    .line 113
    invoke-static {v2, v4, v1}, Lye/d;->a(Lye/a;ILjava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    throw v0

    .line 121
    :cond_2
    iget-object v2, p0, Lye/d;->a:Lye/a;

    .line 122
    .line 123
    instance-of v4, v2, Lye/j;

    .line 124
    .line 125
    if-eqz v4, :cond_3

    .line 126
    .line 127
    new-instance v2, Lye/o;

    .line 128
    .line 129
    invoke-direct {v2, v1, v0}, Lye/o;-><init>(ILse/g;)V

    .line 130
    .line 131
    .line 132
    iput-object v2, p0, Lye/d;->a:Lye/a;

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 136
    .line 137
    const-string v0, "EmptyArrayMap"

    .line 138
    .line 139
    invoke-static {v2, v3, v0}, Lye/d;->a(Lye/a;ILjava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_4
    return-void
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
