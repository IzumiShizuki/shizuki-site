.class public abstract Lzc/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lbe/e;

.field public static final b:Lbe/e;

.field public static final c:Lbe/e;

.field public static final d:Lbe/e;

.field public static final e:Lbe/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {v0}, Lbe/e;->e(Ljava/lang/String;)Lbe/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lzc/e;->a:Lbe/e;

    .line 8
    .line 9
    const-string v0, "replaceWith"

    .line 10
    .line 11
    invoke-static {v0}, Lbe/e;->e(Ljava/lang/String;)Lbe/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lzc/e;->b:Lbe/e;

    .line 16
    .line 17
    const-string v0, "level"

    .line 18
    .line 19
    invoke-static {v0}, Lbe/e;->e(Ljava/lang/String;)Lbe/e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lzc/e;->c:Lbe/e;

    .line 24
    .line 25
    const-string v0, "expression"

    .line 26
    .line 27
    invoke-static {v0}, Lbe/e;->e(Ljava/lang/String;)Lbe/e;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lzc/e;->d:Lbe/e;

    .line 32
    .line 33
    const-string v0, "imports"

    .line 34
    .line 35
    invoke-static {v0}, Lbe/e;->e(Ljava/lang/String;)Lbe/e;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lzc/e;->e:Lbe/e;

    .line 40
    .line 41
    return-void
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

.method public static final a(Lvc/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lzc/j;
    .locals 9

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "message"

    .line 7
    .line 8
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "replaceWith"

    .line 12
    .line 13
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lzc/j;

    .line 17
    .line 18
    sget-object v1, Lvc/n;->o:Lbe/c;

    .line 19
    .line 20
    new-instance v2, Lge/w;

    .line 21
    .line 22
    invoke-direct {v2, p2}, Lge/g;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance p2, Lub/k;

    .line 26
    .line 27
    sget-object v3, Lzc/e;->d:Lbe/e;

    .line 28
    .line 29
    invoke-direct {p2, v3, v2}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Lge/b;

    .line 33
    .line 34
    new-instance v3, Lvc/g;

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    invoke-direct {v3, p0, v4}, Lvc/g;-><init>(Lvc/i;I)V

    .line 38
    .line 39
    .line 40
    sget-object v5, Lvb/r;->a:Lvb/r;

    .line 41
    .line 42
    invoke-direct {v2, v5, v3}, Lge/b;-><init>(Ljava/util/List;Lic/k;)V

    .line 43
    .line 44
    .line 45
    new-instance v3, Lub/k;

    .line 46
    .line 47
    sget-object v5, Lzc/e;->e:Lbe/e;

    .line 48
    .line 49
    invoke-direct {v3, v5, v2}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    new-array v5, v2, [Lub/k;

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    aput-object p2, v5, v6

    .line 57
    .line 58
    aput-object v3, v5, v4

    .line 59
    .line 60
    invoke-static {v5}, Lvb/w;->v([Lub/k;)Ljava/util/Map;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-direct {v0, p0, v1, p2}, Lzc/j;-><init>(Lvc/i;Lbe/c;Ljava/util/Map;)V

    .line 65
    .line 66
    .line 67
    new-instance p2, Lzc/j;

    .line 68
    .line 69
    sget-object v1, Lvc/n;->m:Lbe/c;

    .line 70
    .line 71
    new-instance v3, Lge/w;

    .line 72
    .line 73
    invoke-direct {v3, p1}, Lge/g;-><init>(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, Lub/k;

    .line 77
    .line 78
    sget-object v5, Lzc/e;->a:Lbe/e;

    .line 79
    .line 80
    invoke-direct {p1, v5, v3}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    new-instance v3, Lge/a;

    .line 84
    .line 85
    invoke-direct {v3, v0}, Lge/g;-><init>(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Lub/k;

    .line 89
    .line 90
    sget-object v5, Lzc/e;->b:Lbe/e;

    .line 91
    .line 92
    invoke-direct {v0, v5, v3}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance v3, Lge/i;

    .line 96
    .line 97
    sget-object v5, Lvc/n;->n:Lbe/c;

    .line 98
    .line 99
    const-string v7, "topLevelFqName"

    .line 100
    .line 101
    invoke-static {v5, v7}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    new-instance v7, Lbe/b;

    .line 105
    .line 106
    invoke-virtual {v5}, Lbe/c;->b()Lbe/c;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    iget-object v5, v5, Lbe/c;->a:Lbe/d;

    .line 111
    .line 112
    invoke-virtual {v5}, Lbe/d;->g()Lbe/e;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-direct {v7, v8, v5}, Lbe/b;-><init>(Lbe/c;Lbe/e;)V

    .line 117
    .line 118
    .line 119
    invoke-static {p3}, Lbe/e;->e(Ljava/lang/String;)Lbe/e;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    invoke-direct {v3, v7, p3}, Lge/i;-><init>(Lbe/b;Lbe/e;)V

    .line 124
    .line 125
    .line 126
    new-instance p3, Lub/k;

    .line 127
    .line 128
    sget-object v5, Lzc/e;->c:Lbe/e;

    .line 129
    .line 130
    invoke-direct {p3, v5, v3}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    const/4 v3, 0x3

    .line 134
    new-array v3, v3, [Lub/k;

    .line 135
    .line 136
    aput-object p1, v3, v6

    .line 137
    .line 138
    aput-object v0, v3, v4

    .line 139
    .line 140
    aput-object p3, v3, v2

    .line 141
    .line 142
    invoke-static {v3}, Lvb/w;->v([Lub/k;)Ljava/util/Map;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-direct {p2, p0, v1, p1}, Lzc/j;-><init>(Lvc/i;Lbe/c;Ljava/util/Map;)V

    .line 147
    .line 148
    .line 149
    return-object p2
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
.end method
