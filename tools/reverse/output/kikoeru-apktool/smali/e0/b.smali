.class public final Le0/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lz0/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz0/e;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [Le0/c;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Le0/b;->a:Lz0/e;

    .line 14
    .line 15
    return-void
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


# virtual methods
.method public final a(Lp1/c;Lac/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Le0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Le0/a;

    .line 7
    .line 8
    iget v1, v0, Le0/a;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Le0/a;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Le0/a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Le0/a;-><init>(Le0/b;Lac/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Le0/a;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Le0/a;->j:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget p1, v0, Le0/a;->g:I

    .line 35
    .line 36
    iget v1, v0, Le0/a;->f:I

    .line 37
    .line 38
    iget-object v3, v0, Le0/a;->e:[Ljava/lang/Object;

    .line 39
    .line 40
    iget-object v4, v0, Le0/a;->d:Lp1/c;

    .line 41
    .line 42
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object p2, v4

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p2, p0, Le0/b;->a:Lz0/e;

    .line 59
    .line 60
    iget-object v1, p2, Lz0/e;->a:[Ljava/lang/Object;

    .line 61
    .line 62
    iget p2, p2, Lz0/e;->c:I

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    move v3, p2

    .line 66
    move-object p2, p1

    .line 67
    move p1, v3

    .line 68
    move-object v3, v1

    .line 69
    const/4 v1, 0x0

    .line 70
    :goto_1
    if-ge v1, p1, :cond_4

    .line 71
    .line 72
    aget-object v4, v3, v1

    .line 73
    .line 74
    check-cast v4, Le0/c;

    .line 75
    .line 76
    new-instance v5, Lb0/d0;

    .line 77
    .line 78
    const/4 v6, 0x5

    .line 79
    invoke-direct {v5, v6, p2}, Lb0/d0;-><init>(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iput-object p2, v0, Le0/a;->d:Lp1/c;

    .line 83
    .line 84
    iput-object v3, v0, Le0/a;->e:[Ljava/lang/Object;

    .line 85
    .line 86
    iput v1, v0, Le0/a;->f:I

    .line 87
    .line 88
    iput p1, v0, Le0/a;->g:I

    .line 89
    .line 90
    iput v2, v0, Le0/a;->j:I

    .line 91
    .line 92
    invoke-static {v4, v5, v0}, Lpc/f0;->n(Li2/m;Lic/a;Lac/c;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    sget-object v5, Lzb/a;->a:Lzb/a;

    .line 97
    .line 98
    if-ne v4, v5, :cond_3

    .line 99
    .line 100
    return-object v5

    .line 101
    :cond_3
    :goto_2
    add-int/2addr v1, v2

    .line 102
    goto :goto_1

    .line 103
    :cond_4
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 104
    .line 105
    return-object p1
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
.end method
